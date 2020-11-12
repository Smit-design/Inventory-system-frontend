package ac.za.cput.util;

import ac.za.cput.entity.user.ControlClerk;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/inventory/controlclerk/")
public class JSONService {

    @POST
    @Path("/create")
    @Consumes("application/json")
    public Response createProductInJSON(ControlClerk controlClerk) {

        String result = "Product created : " + controlClerk;
        return Response.status(201).entity(result).build();
    }
}
