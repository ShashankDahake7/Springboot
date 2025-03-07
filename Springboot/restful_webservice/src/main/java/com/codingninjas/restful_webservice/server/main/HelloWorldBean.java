package com.codingninjas.restful_webservice.server.main;

public class HelloWorldBean {
    private String msg;
    // Constructor
    public HelloWorldBean(String msg) {
        this.msg = msg;
    }
    // Getter and Setter
    public String getMessage() {
        return msg;
    }
    public void setMessage(String msg) {
        this.msg = msg;
    }
    @Override
    public String toString() {
        return String.format("HelloWorldBean [msg=%s]", msg);
    }
}