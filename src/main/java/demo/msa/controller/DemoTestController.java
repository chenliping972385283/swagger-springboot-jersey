package demo.msa.controller;

import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by jinli on 2017/8/18.
 */
@Controller
@Path("/test")
public class DemoTestController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/success")
    public String testDemo(){
        return "test success";
    }
}
