package com.codingninjas.springbootSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Authenticated User!";
    }

    @GetMapping("/securityNone")
    public String publicEndpoint() {
        return "This endpoint is open to all!";
    }
}