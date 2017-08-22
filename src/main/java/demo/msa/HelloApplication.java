package demo.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Created by jinli on 2017/7/31.
 */

@SpringBootApplication
public class HelloApplication extends SpringBootServletInitializer {


  /*  @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(HelloApplication.class);
    }*/

    public static void main(String[] args)
    {
        SpringApplication.run(HelloApplication.class, args);
    }

}
