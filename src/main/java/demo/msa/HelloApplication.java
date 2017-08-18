package demo.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jinli on 2017/7/31.
 */

@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args){
        SpringApplication.run(HelloApplication.class,args);
    }

}
