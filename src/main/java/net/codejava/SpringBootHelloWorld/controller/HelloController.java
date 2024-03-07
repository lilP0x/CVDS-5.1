package net.codejava.SpringBootHelloWorld.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class to handle HTTP requests related to greetings.
 */
@RestController
public class HelloController {

    /**
     * Endpoint to greet the client.
     * This endpoint allows cross-origin requests from http://mi-frontend.com,
     * with allowed headers and specified HTTP methods.
     * 
     * @return A greeting message.
     */
    @CrossOrigin(origins = "http://mi-frontend.com", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST})
    @GetMapping("/api/hello")
    public String hello() {
        return "¡Hola, Mundo!"; // Returns a greeting message
    }
}
