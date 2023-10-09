using Ardalis.SmartEnum;

namespace Bink.Core.Parsers.Models;

public sealed class ActionNameEnum : SmartEnum<ActionNameEnum>
{
    public static readonly ActionNameEnum Check = new ActionNameEnum("Checks", 1);
    public static readonly ActionNameEnum Fold = new ActionNameEnum("Folds", 2);
    public static readonly ActionNameEnum Raise = new ActionNameEnum("Raises", 3);
    public static readonly ActionNameEnum Call = new ActionNameEnum("Calls", 4);
    public static readonly ActionNameEnum AllIn = new ActionNameEnum("All-in", 5);
    public static readonly ActionNameEnum Bet = new ActionNameEnum("Bets", 6);
    public static readonly ActionNameEnum Showdown = new ActionNameEnum("Showdown", 7);    
    public static readonly ActionNameEnum Leave = new ActionNameEnum("leave", 18);
    public static readonly ActionNameEnum Stand = new ActionNameEnum("stand", 8);
    public static readonly ActionNameEnum SitDown = new ActionNameEnum("sit down", 9);
    public static readonly ActionNameEnum SitOut = new ActionNameEnum("sit out", 10);
    public static readonly ActionNameEnum Deposit = new ActionNameEnum("deposit", 11);
    public static readonly ActionNameEnum ReturnUncalledPortion = new ActionNameEnum("Return uncalled portion of bet", 12);
    public static readonly ActionNameEnum ReturnUncalledBlind = new ActionNameEnum("Return uncalled blind", 13);
    public static readonly ActionNameEnum PostChip = new ActionNameEnum("Posts chip", 14);
    public static readonly ActionNameEnum PostDeadChip = new ActionNameEnum("Posts dead chip", 15);
    public static readonly ActionNameEnum Rejoin = new ActionNameEnum("re-join", 16);
    public static readonly ActionNameEnum Enter = new ActionNameEnum("enter", 17);

    
    private ActionNameEnum(string name, int value) : base(name, value)
    {
        
    }
}