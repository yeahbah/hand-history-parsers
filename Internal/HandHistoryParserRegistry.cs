namespace Bink.Core.Parsers.Internal;

internal class HandHistoryParserRegistry : IHandHistoryParserRegistry
{
    private readonly IEnumerable<IHandHistoryParser> _parsers; 
    public HandHistoryParserRegistry(IEnumerable<IHandHistoryParser> handHistoryParsers)
    {
        _parsers = handHistoryParsers;
    }
    
    public IEnumerable<IHandHistoryParser> GetRegisteredParsers()
    {
        return _parsers;
    }
}