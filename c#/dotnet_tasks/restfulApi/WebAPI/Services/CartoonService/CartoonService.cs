namespace WebAPI.Services.CartoonService;

public class CartoonService : ICartoonService
{

    private static List<Cartoon> cartoons = new(){
            new Cartoon(),
            new Cartoon
            {
                ID = 2,
                Name = "SpongeBob SquarePants",
                Genre = Genre.Comedy,
                ReleaseDate = new DateTime(1999, 5, 1),
                Topic = "Underwater adventures",
                Characters = new List<string> { "SpongeBob", "Patrick", "Sandy" }
            },
            new Cartoon
            {
                ID = 3,
                Name = "The Simpsons",
                Genre = Genre.Comedy,
                ReleaseDate = new DateTime(1989, 12, 17),
                Topic = "Family life in a suburban town",
                Characters = new List<string> { "Homer", "Marge", "Bart", "Lisa", "Maggie" }
            },
            new Cartoon
            {
                ID = 4,
                Name = "Teenage Mutant Ninja Turtles",
                Genre = Genre.Action,
                ReleaseDate = new DateTime(1987, 12, 10),
                Topic = "Crime-fighting mutant turtles",
                Characters = new List<string> { "Leonardo", "Michelangelo", "Donatello", "Raphael" }
            },
            new Cartoon
            {
                ID = 5,
                Name = "Adventure Time",
                Genre = Genre.Adventure,
                ReleaseDate = new DateTime(2010, 4, 5),
                Topic = "Surreal adventures in a post-apocalyptic world",
                Characters = new List<string> { "Finn", "Jake", "Princess Bubblegum" }
            }
        };
    private readonly IMapper mapper;

    public CartoonService(IMapper mapper)
    {
        this.mapper = mapper;
    }

    public ServiceResponse<List<GetCartoonDto>> AddCartoon(AddCartoonDto newCartoon)
    {
        var serviceResponse = new ServiceResponse<List<GetCartoonDto>>();
        try
        {
            var cartoon = mapper.Map<Cartoon>(newCartoon);
            cartoon.ID = cartoons.Max(c => c.ID) + 1;
            cartoons.Add(cartoon);
            serviceResponse.Data = cartoons.Select(c => mapper.Map<GetCartoonDto>(c)).ToList();
        }
        catch (Exception ex)
        {
            serviceResponse.Success = false;
            serviceResponse.Error = ex.Message;
        }
        return serviceResponse;
    }

    public ServiceResponse<GetCartoonDto> DeleteCartoon(int id)
    {
        var serviceResponse = new ServiceResponse<GetCartoonDto>();
        try
        {
            var cartoon = cartoons.FirstOrDefault(c => c.ID == id);
            if (cartoon is null)
                throw new Exception($"Cartoon with Id '{id}' not found.");

            cartoons.Remove(cartoon);

            serviceResponse.Data = mapper.Map<GetCartoonDto>(cartoon);
        }
        catch (Exception ex)
        {
            serviceResponse.Success = false;
            serviceResponse.Error = ex.Message;
        }

        return serviceResponse;
    }

    public ServiceResponse<List<GetCartoonDto>> GetAllCartoons()
    {
        var serviceResponse = new ServiceResponse<List<GetCartoonDto>>();
        serviceResponse.Data = cartoons.Select(c => mapper.Map<GetCartoonDto>(c)).ToList();
        return serviceResponse;
    }

    public ServiceResponse<GetCartoonDto> GetCartoonById(int id)
    {
        var serviceResponse = new ServiceResponse<GetCartoonDto>();
        try
        {
            var cartoon = cartoons.Where(c => c.ID == id).FirstOrDefault();
            if (cartoon is null)
                throw new Exception($"Cartoon with Id '{id}' not found.");
            serviceResponse.Data = mapper.Map<GetCartoonDto>(cartoon);
        }
        catch (Exception ex)
        {
            serviceResponse.Success = false;
            serviceResponse.Error = ex.Message;
        }

        return serviceResponse;
    }

    public ServiceResponse<List<GetCartoonDto>> GetCartoonByName(string name)
    {
        var serviceResponse = new ServiceResponse<List<GetCartoonDto>>();
        try
        {
            var cartoon = cartoons.Where(c => c.Name.ToUpper().Contains(name.ToUpper())).ToList();
            if (cartoon is null)
                throw new Exception($"Cartoon with name '{name}' not found.");
            serviceResponse.Data = cartoon.Select(c => mapper.Map<GetCartoonDto>(c)).ToList();
        }
        catch (Exception ex)
        {
            serviceResponse.Success = false;
            serviceResponse.Error = ex.Message;
        }

        return serviceResponse;
    }

    public ServiceResponse<List<GetCartoonDto>> GetCartoonsByCharacters(List<string> characters)
    {
        var serviceResponse = new ServiceResponse<List<GetCartoonDto>>();
        try
        {
            var cartoon = cartoons.Where(c => c.Characters.Any(ch => characters.Contains(ch, StringComparer.OrdinalIgnoreCase)))
                    .ToList();
            if (cartoon is null)
                throw new Exception($"Cartoon with characters '{characters.ToString()}' not found.");
            serviceResponse.Data = cartoon.Select(c => mapper.Map<GetCartoonDto>(c)).ToList();
        }
        catch (Exception ex)
        {
            serviceResponse.Success = false;
            serviceResponse.Error = ex.Message;
        }

        return serviceResponse;
    }

    public ServiceResponse<List<GetCartoonDto>> GetCartoonsByGenre(Genre genre)
    {
        var serviceResponse = new ServiceResponse<List<GetCartoonDto>>();
        try
        {
            var cartoon = cartoons.Where(c => c.Genre.HasFlag(genre)).ToList();
            if (cartoon is null)
                throw new Exception($"Cartoon with genre '{genre}' not found.");
            serviceResponse.Data = cartoon.Select(c => mapper.Map<GetCartoonDto>(c)).ToList();
        }
        catch (Exception ex)
        {
            serviceResponse.Success = false;
            serviceResponse.Error = ex.Message;
        }

        return serviceResponse;
    }

    public ServiceResponse<GetCartoonDto> UpdateCartoon(UpdateCartoonDto updatedCartoon)
    {
        var serviceResponse = new ServiceResponse<GetCartoonDto>();
        try
        {
            var cartoon = cartoons.FirstOrDefault(c => c.ID == updatedCartoon.ID);
            if (cartoon is null)
                throw new Exception($"Cartoon with Id '{updatedCartoon.ID}' not found.");

            mapper.Map(updatedCartoon, cartoon);

            serviceResponse.Data = mapper.Map<GetCartoonDto>(cartoon);
        }
        catch (Exception ex)
        {
            serviceResponse.Success = false;
            serviceResponse.Error = ex.Message;
        }

        return serviceResponse;
    }
}
