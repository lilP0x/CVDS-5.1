package net.codejava.SpringBootHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main class for the Spring Boot application.
 */
@SpringBootApplication
@RestController
public class SpringBootHelloWorldApplication {

    /**
     * Main method to start the Spring Boot application.
     * 
     * @param args Command-line arguments passed to the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringBootHelloWorldApplication.class, args);
    }

    /**
     * Handler method for the root endpoint ("/").
     * 
     * @return A greeting message for the root endpoint.
     */
    @RequestMapping("/")
    public String home() {
        return "Hello world Spring Boot";
    }

    /**
     * Handler method for the "/new" endpoint.
     * 
     * @return HTML content for the "/new" endpoint.
     */
    @RequestMapping("/new")
    @ResponseBody
    public String newEndpoint() {
        return "<h2>This is a new endpoint</h2><p>Welcome to the new endpoint!</p>";
    }
}
