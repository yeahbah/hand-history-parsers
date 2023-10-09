using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Microsoft.Extensions.Logging;

namespace Bink.Core.Parsers.Ignition;

public class IgnitionParserErrorListener : BaseErrorListener
{
    private readonly ILogger logger;
    public int FailCount { get; private set; } = 0;
    
    public IgnitionParserErrorListener(ILogger logger)
    {
        this.logger = logger;
    }
    
    public Action? OnFail { get; set; }
    
    public override void SyntaxError(
        [NotNull] IRecognizer recognizer,
        [Nullable] IToken offendingSymbol,
        int line,
        int charPositionInLine,
        [NotNull] string msg,
        [Nullable] RecognitionException e)
    {
        logger.LogDebug($"Line: {line}, {charPositionInLine}, symbol: {offendingSymbol.Text}");
        logger.LogCritical(msg);    
        logger.LogError(e, e.Message);
        FailCount++;
        
        OnFail?.Invoke();
    }
}