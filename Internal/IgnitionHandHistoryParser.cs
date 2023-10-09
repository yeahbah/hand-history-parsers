using System.Collections.Concurrent;
using Antlr4.Runtime;
using Bink.Core.Parsers.Ignition;
using Bink.Core.Parsers.Ignition.Antlr;
using Bink.Core.Parsers.Models;
using Microsoft.Extensions.Logging;

namespace Bink.Core.Parsers.Internal;

internal class IgnitionHandHistoryParser : IIgnitionHandHistoryParser
{
    private readonly ILogger<IgnitionHandHistoryParser> logger;
    
    public IgnitionHandHistoryParser(ILogger<IgnitionHandHistoryParser> logger)
    {
        this.logger = logger;
    }
    
    public async Task<IEnumerable<HandHistoryParserModel>> ParseHandHistoryFile(string handHistoryFile,
        CancellationToken cancellationToken)
    {
        var task = Task.Run(() =>
        {
            var input = File.ReadAllText(handHistoryFile);
            var inputStream = new AntlrInputStream(input);
            var lexer = new PokerHandHistoryLexer(inputStream);
            var commonTokenStream = new CommonTokenStream(lexer);
            var parser = new IgnitionParser(commonTokenStream);

            long? lastHandId = null;
            parser.AddParseListener(new IgnitionHandListener(handId =>
            {
                lastHandId = handId;
                _visitedHands.Add(1);
            }));
        
            var errorListener = new IgnitionParserErrorListener(logger)
            {
                OnFail = () =>
                {
                    _failCounter.Add(1);
                    if (lastHandId != null)
                    {
                        logger.LogError($"Parse fail in hand id: {lastHandId}");
                    }
                
                    logger.LogError($"Parse error in file: {Path.GetFileName(handHistoryFile)}");
                }
            };        
            parser.AddErrorListener(errorListener);

            var visitor = new IgnitionHandParserVisitor();
            try
            {
                visitor.VisitHands(parser.hands());
            }
            catch (Exception ex)
            {
                logger.LogError($"Failed to parse file: {handHistoryFile}. Hand Id: {lastHandId}");
                logger.LogError(ex, ex.Message);
                throw;
            }

            //moveToArchive(handHistoryFile);

            _successCounter.Add(visitor.HandHistories.Count);
            return visitor.HandHistories.AsEnumerable();    
        }, cancellationToken);
        
        return await task.WaitAsync(cancellationToken);
    }

    private void moveToArchive(string handHistoryFile)
    {
        var archiveFolder = Path.Combine(Path.GetDirectoryName(handHistoryFile), "archive");
        if (!Directory.Exists(archiveFolder))
        {
            Directory.CreateDirectory(archiveFolder);
        }

        File.Move(handHistoryFile, Path.Combine(archiveFolder, Path.GetFileName(handHistoryFile)), true);
    }

    public async Task<IEnumerable<HandHistoryParserModel>> ParseHandHistoryFiles(ConcurrentDictionary<string, bool> handHistoryFiles,
        CancellationToken cancellationToken)
    {
        var result = new ConcurrentBag<HandHistoryParserModel>();
        await Parallel.ForEachAsync(handHistoryFiles, //new ParallelOptions { MaxDegreeOfParallelism = Environment.ProcessorCount }, 
            cancellationToken, async (file, cts) =>
            {
                var hands = await ParseHandHistoryFile(file.Key, cts);
                Array.ForEach(hands.ToArray(), hand => result.Add(hand));
                handHistoryFiles[file.Key] = true;
            });

        return result.AsEnumerable();
    }
    
    private readonly ConcurrentBag<int> _failCounter = new();
    public int FailCount()
    {
        return _failCounter.Count;
    }

    private readonly ConcurrentBag<int> _successCounter = new();
    public int SuccessCount()
    {
        return _successCounter.Sum();
    }

    private readonly ConcurrentBag<int> _visitedHands = new();
    public int TotalHandCount()
    {
        return _visitedHands.Count;
    }
}