package demo.msa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jinli on 2017/7/31.
 */
@RestController
public class HelloController {

    @RequestMapping(method= RequestMethod.GET,path="/hello")
    public String Hello(){
        return "hello";
    }
}
