namespace Bink.Core.Parsers.Models;

public record StreetActionModel
{
    public ActionNameEnum? ActionName { get; init; }
    public decimal ActionAmount { get; init; }
    public PlayerPosition? PlayerPosition { get; init; }
    public bool IsMe { get; set; }
}