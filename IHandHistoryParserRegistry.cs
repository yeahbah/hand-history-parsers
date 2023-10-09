namespace Bink.Core.Parsers;

public interface IHandHistoryParserRegistry
{
    IEnumerable<IHandHistoryParser> GetRegisteredParsers();
}