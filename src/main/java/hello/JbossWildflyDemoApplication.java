package hello;

import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class JbossWildflyDemoApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JbossWildflyDemoApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(JbossWildflyDemoApplication.class, args);
    }
}