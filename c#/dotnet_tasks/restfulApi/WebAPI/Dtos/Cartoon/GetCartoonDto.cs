namespace WebAPI.Dtos.Cartoon;

public class GetCartoonDto
{
    public int ID { get; set; }
    public string Name { get; set; } = "Tom and Jerry";
    public Genre Genre { get; set; } = Genre.Comedy;
    public DateTime ReleaseDate { get; set; } = new DateTime(1940, 2, 10);
    public string Topic { get; set; } = "Slapstick comedy";
    public List<string> Characters { get; set; } = new List<string> { "Tom", "Jerry" };
}
