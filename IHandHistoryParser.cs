using System.Collections.Concurrent;
using Bink.Core.Parsers.Models;

namespace Bink.Core.Parsers;

public interface IHandHistoryParser
{
    Task<IEnumerable<HandHistoryParserModel>> ParseHandHistoryFile(string handHistoryFile, CancellationToken cancellationToken);
    Task<IEnumerable<HandHistoryParserModel>> ParseHandHistoryFiles(ConcurrentDictionary<string, bool> handHistoryFiles,
        CancellationToken cancellationToken);

    int FailCount();
    int SuccessCount();
    int TotalHandCount();
}