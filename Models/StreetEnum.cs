using Ardalis.SmartEnum;

namespace Bink.Core.Parsers.Models;

public sealed class StreetEnum : SmartEnum<StreetEnum>
{
    public static readonly StreetEnum PreFlop = new StreetEnum("PRE-FLOP", 1);
    public static readonly StreetEnum Flop = new StreetEnum("FLOP", 2);
    public static readonly StreetEnum Turn = new StreetEnum("TURN", 3);
    public static readonly StreetEnum River = new StreetEnum("RIVER", 4);
    
    private StreetEnum(string name, int value) : base(name, value)
    {
            
    }
}