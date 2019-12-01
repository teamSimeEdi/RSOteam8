package si.RSOteam8;

import org.json.simple.JSONObject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("demo/info")
public class JsonResource {

    @GET
    public Response getAllCustomers() {
        JSONObject json = new JSONObject();
        String[] clani = new String[2];
        String[] ms = new String[2];
        String[] gh = new String[2];
        String[] tr = new String[2];
        String[] dh = new String[2];
        clani[0] = "ec9381";
        clani[1] = "sz6554";

        json.put("opis_projekta","Nas projekt implementira aplikacijo za oddajo nepremicnin.");
        json.put("clani",clani);
        return Response.ok(json).build();
    }

}