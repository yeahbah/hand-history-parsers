namespace Bink.Core.Parsers.Models;

public record SummaryModel
{
    public record HandResultModel
    {
        public PlayerPosition? PlayerPosition { get; init; }
        public decimal WinAmount { get; init; }
        public string? Hand { get; init; }
        public string? HandDescription { get; init; }
        public bool IsMe { get; set; }
    }
    
    public decimal TotalPot { get; init; }
    public string? FinalBoard { get; init; }
    public IEnumerable<HandResultModel>? HandResults { get; set; }
    
}

