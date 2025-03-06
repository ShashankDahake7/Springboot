package org.example.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired  // Field Injection
    private Address address;

    // Constructor Injection
    @Autowired
    public Person(Address address) {
        this.address = address;
    }

    // Setter Injection
    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}