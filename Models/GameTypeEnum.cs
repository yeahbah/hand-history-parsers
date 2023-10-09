using Ardalis.SmartEnum;

namespace Bink.Core.Parsers.Models;

public sealed class GameTypeEnum : SmartEnum<GameTypeEnum>
{
    public static readonly GameTypeEnum HoldemNoLimit = new GameTypeEnum("HOLDEM No Limit", 1);
    public static readonly GameTypeEnum ZoneHoldemNoLimit = new GameTypeEnum("HOLDEMZonePoker No Limit", 2);
        
    private GameTypeEnum(string name, int value) : base(name, value)
    {
        
    }
}