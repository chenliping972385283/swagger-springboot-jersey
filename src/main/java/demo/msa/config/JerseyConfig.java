package demo.msa.config;

import demo.msa.controller.HelloController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jinli on 2017/8/18.
 */
@Configuration
public class JerseyConfig  extends ResourceConfig{

    public JerseyConfig(){
        //register(HelloController.class);
        packages("demo.msa.controller");
    }
}
