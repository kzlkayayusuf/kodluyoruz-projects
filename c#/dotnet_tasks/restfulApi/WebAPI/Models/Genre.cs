using System.Text.Json.Serialization;

namespace WebAPI.Models;

[JsonConverter(typeof(JsonStringEnumConverter))]
public enum Genre
{
    Comedy = 1,
    Action = 2,
    Adventure = 3
}
