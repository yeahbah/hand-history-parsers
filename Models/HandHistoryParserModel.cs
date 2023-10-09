namespace Bink.Core.Parsers.Models;

public record HandHistoryParserModel
{
    public IEnumerable<SeatModel> Seats { get; init; } = new List<SeatModel>();
    public GameTypeEnum? GameType { get; init; }
    public long HandId { get; init; }
    public string? TableId { get; set; }
    public DateTime HandTimestamp { get; init; }
    public string? PokerSite { get; set; }
    public StreetModel? PreFlop { get; init; }
    public StreetModel? Flop { get; init; }
    public StreetModel? Turn { get; init; }
    public StreetModel? River { get; init; }
    public SummaryModel? Summary { get; init; }
}