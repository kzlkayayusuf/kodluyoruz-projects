using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("api/v1.0/[controller]")]
public class CartoonController : ControllerBase
{
    private readonly ICartoonService cartoonService;

    public CartoonController(ICartoonService cartoonService)
    {
        this.cartoonService = cartoonService;
    }

    [HttpGet("GetAll")]
    public ActionResult<ServiceResponse<GetCartoonDto>> Get()
    {
        var response = cartoonService.GetAllCartoons();
        if (response.Data is null)
            return BadRequest(response);
        return Ok(response);
    }

    [HttpGet("{id}")]
    public ActionResult<ServiceResponse<GetCartoonDto>> GetSingle(int id)
    {
        var response = cartoonService.GetCartoonById(id);
        if (response.Data is null)
            return NotFound(response);
        return Ok(response);
    }

    [HttpGet]
    [Route("GetByName")]
    public ActionResult<ServiceResponse<GetCartoonDto>> GetByName([FromQuery] string name)
    {
        var response = cartoonService.GetCartoonByName(name);
        if (response.Data is null)
            return NotFound(response);
        return Ok(response);
    }

    [HttpGet]
    [Route("GetByGenre")]
    public ActionResult<ServiceResponse<GetCartoonDto>> GetByGenre([FromQuery] Genre genre)
    {
        var response = cartoonService.GetCartoonsByGenre(genre);
        if (response.Data is null)
            return NotFound(response);
        return Ok(response);
    }

    [HttpGet]
    [Route("GetByCharacters")]
    public ActionResult<ServiceResponse<GetCartoonDto>> GetByCharacters([FromQuery] List<string> characters)
    {
        var response = cartoonService.GetCartoonsByCharacters(characters);
        if (response.Data is null)
            return NotFound(response);
        return Ok(response);
    }

    [HttpPost]
    public ActionResult<ServiceResponse<List<GetCartoonDto>>> AddCartoon([FromBody] AddCartoonDto newCartoon)
    {
        var response = cartoonService.AddCartoon(newCartoon);
        if (response.Data is null)
            return BadRequest(response);
        return Created(Url.Action("GetSingle", new { id = response.Data[response.Data.Count - 1].ID })!, response);
        //Headers Location kısmında bu uriyi gösterir.
    }

    [HttpPut]
    public ActionResult<ServiceResponse<List<GetCartoonDto>>> UpdateCartoon([FromBody] UpdateCartoonDto updatedCartoon)
    {
        var response = cartoonService.UpdateCartoon(updatedCartoon);
        if (response.Data is null)
            return NotFound(response);

        return Ok(response);
    }

    [HttpPatch]
    public ActionResult<ServiceResponse<List<GetCartoonDto>>> UpdateCartoonPatch([FromBody] UpdateCartoonDto updatedCartoon)
    {
        var response = cartoonService.UpdateCartoon(updatedCartoon);
        if (response.Data is null)
            return NotFound(response);

        return Ok(response);
    }

    [HttpDelete("{id}")]
    public ActionResult<ServiceResponse<GetCartoonDto>> DeleteCartoon(int id)
    {
        var response = cartoonService.DeleteCartoon(id);
        if (response.Data is null)
            return NotFound(response);

        return Ok(response);
    }
}
