using System.ComponentModel.DataAnnotations;

namespace WebAPI.Dtos.Cartoon;

public class UpdateCartoonDto
{
    public int ID { get; set; }
    [Required]
    [StringLength(maximumLength: 250, MinimumLength = 10)]
    public string Name { get; set; } = "Tom and Jerry";
    [Required]
    [EnumDataType(typeof(Genre), ErrorMessage = "Please provide a valid Genre type {Comedy},{Action} or {Adventure}")]
    public Genre Genre { get; set; } = Genre.Comedy;
    [Required]
    [DataType(DataType.Date)]
    public DateTime ReleaseDate { get; set; } = new DateTime(1940, 2, 10);
    [Required]
    [StringLength(maximumLength: 250, MinimumLength = 10)]
    public string Topic { get; set; } = "Slapstick comedy";
    [MinLength(1)]
    public List<string> Characters { get; set; } = new List<string> { "Tom", "Jerry" };
}
