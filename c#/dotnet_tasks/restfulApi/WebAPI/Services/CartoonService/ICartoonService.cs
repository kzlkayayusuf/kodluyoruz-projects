namespace WebAPI.Services.CartoonService;

public interface ICartoonService
{
    ServiceResponse<List<GetCartoonDto>> GetAllCartoons();
    ServiceResponse<GetCartoonDto> GetCartoonById(int id);
    ServiceResponse<List<GetCartoonDto>> GetCartoonByName(string name);
    ServiceResponse<List<GetCartoonDto>> GetCartoonsByGenre(Genre genre);
    ServiceResponse<List<GetCartoonDto>> GetCartoonsByCharacters(List<string> characters);
    ServiceResponse<List<GetCartoonDto>> AddCartoon(AddCartoonDto newCartoon);
    ServiceResponse<GetCartoonDto> UpdateCartoon(UpdateCartoonDto updatedCartoon);
    ServiceResponse<GetCartoonDto> DeleteCartoon(int id);
}
