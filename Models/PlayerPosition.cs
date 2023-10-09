using Ardalis.SmartEnum;

namespace Bink.Core.Parsers.Models;

public sealed class PlayerPosition : SmartEnum<PlayerPosition>
{
    public static readonly PlayerPosition SmallBlind = new PlayerPosition("Small Blind", 1);
    public static readonly PlayerPosition BigBlind = new PlayerPosition("Big Blind", 2);    
    public static readonly PlayerPosition Utg = new PlayerPosition("UTG", 3);
    public static readonly PlayerPosition Utg1 = new PlayerPosition("UTG+1", 4);
    public static readonly PlayerPosition Utg2 = new PlayerPosition("UTG+2", 5);
    public static readonly PlayerPosition Utg3 = new PlayerPosition("UTG+3", 6);
    public static readonly PlayerPosition Utg4 = new PlayerPosition("UTG+4", 7);
    public static readonly PlayerPosition Utg5 = new PlayerPosition("UTG+5", 8);
    public static readonly PlayerPosition Dealer = new PlayerPosition("Dealer", 9);
    
    private PlayerPosition(string name, int value) : base(name, value)
    {
        
    }
}