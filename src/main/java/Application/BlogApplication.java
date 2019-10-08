package Application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class BlogApplication {

    public static void main(String[] args){

        SpringApplication.run(BlogApplication.class, args);

    }

}
