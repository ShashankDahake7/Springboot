package com.codingninjas.restful_webservice.server.main;
import com.codingninjas.restful_webservice.server.main.HelloWorldBean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
// Controller
@RestController
public class HelloWorldController {
    // Return String response
    @GetMapping(path="/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }
    // Return a Bean response
    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World!");
    }
}