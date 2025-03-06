package org.example.controllers;

import org.example.models.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    private final Person person;

    public PersonController(Person person) {
        this.person = person;
    }

    @GetMapping("/address")
    public String getAddress() {
        return "Street: " + person.getAddress().getStreet() +
                ", City: " + person.getAddress().getCity() +
                ", State: " + person.getAddress().getState();
    }
}
