package demo.msa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by jinli on 2017/7/31.
 */
@Controller
public class HelloController {

    @GET
    @RequestMapping("/hello")
    public String Hello(){
        return "/hello";
    }

    @GET
    @ResponseBody
    @RequestMapping("/hello2")
    public String Hello2(){
        return "Hello";
    }
}
