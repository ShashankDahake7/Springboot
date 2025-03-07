package com.example.springbootJDBC;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootJdbcController {
    @Autowired
    JdbcTemplate jdbc;
    @RequestMapping("/insert")
    public String index() {
        jdbc.execute("INSERT INTO user(name,email) VALUES ('Coding Ninjas','codingNinja@ninja.com')");
        return "Data inserted successfully";
    }
}