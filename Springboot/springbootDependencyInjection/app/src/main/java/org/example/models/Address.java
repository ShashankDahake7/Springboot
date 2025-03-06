package org.example.models;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String street;
    private String city;
    private String state;

    public Address() {
        // Default constructor for Spring to manage bean creation
        this.street = "123 Elm Street";
        this.city = "Springfield";
        this.state = "IL";
    }

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }
}
