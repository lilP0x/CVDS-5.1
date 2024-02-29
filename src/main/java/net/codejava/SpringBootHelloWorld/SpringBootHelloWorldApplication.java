package net.codejava.SpringBootHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringBootHelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHelloWorldApplication.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "<h1>Hello world Spring Boot</h1><p>Welcome to my Spring Boot application!</p>";
    }

    @RequestMapping("/new")
    public String newEndpoint() {
        return "<h2>This is a new endpoint</h2><p>Welcome to the new endpoint!</p>";
    }
}
