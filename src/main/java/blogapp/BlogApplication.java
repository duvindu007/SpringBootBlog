package blogapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

//@ComponentScan("java.blogapp")
@ComponentScan(basePackages=
        {"java.blogapp.controller"})
@SpringBootApplication
@PropertySource("classpath:application.properties")
public class BlogApplication {

    public static void main(String[] args){
        SpringApplication.run(BlogApplication.class, args);
    }
}
