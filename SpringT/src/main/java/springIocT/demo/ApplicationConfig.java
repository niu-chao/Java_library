package springIocT.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author: nc
 * @description：
 */
@Configuration
@ComponentScan(basePackages = "springIocT.demo")
public class ApplicationConfig {

    @Bean
    public User getUser() {
        return  new User("成功");
    }

}
