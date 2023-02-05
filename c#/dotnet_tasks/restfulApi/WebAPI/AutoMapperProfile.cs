namespace WebAPI;

public class AutoMapperProfile : Profile
{
    public AutoMapperProfile()
    {
        CreateMap<Cartoon, GetCartoonDto>();
        CreateMap<AddCartoonDto, Cartoon>();
        CreateMap<UpdateCartoonDto, Cartoon>();
    }
}
