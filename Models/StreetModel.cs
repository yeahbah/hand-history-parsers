namespace Bink.Core.Parsers.Models;

public record StreetModel
{
    public StreetEnum? StreetType { get; init; }
    public string? Cards { get; init; }
    public IEnumerable<StreetActionModel> StreetActions { get; init; } = new List<StreetActionModel>();
}