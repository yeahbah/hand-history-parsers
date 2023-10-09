namespace Bink.Core.Parsers.Models;

public record SeatModel
{
    public int SeatNumber { get; init; }
    public PlayerPosition? PlayerPosition { get; init; } 
    public bool IsMe { get; init; }
    public bool IsDealer => PlayerPosition?.Equals(PlayerPosition.Dealer) ?? false;
    public bool IsSmallBlind { get; init; }
    public bool IsBigBlind { get; init; }
    public decimal StartingStack { get; init; }
    public string? PocketCards { get; init; }
    public decimal? PostBlindAmount { get; init; }
}