package demo.msa.controller;

import com.wordnik.swagger.annotations.ApiOperation;
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

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ApiOperation(value = "根据用户名获取用户对象", httpMethod = "GET", response = Void.class, notes = "根据用户名获取用户对象")
    public String Hello(){
        return "/hello";
    }

    @ResponseBody
    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    @ApiOperation(value = "根据用户名获取用户对象", httpMethod = "GET", response = Void.class, notes = "根据用户名获取用户对象")
    public String Hello2(){
        return "Hello";
    }
}
