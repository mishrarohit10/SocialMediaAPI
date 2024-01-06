package com.rohit.rest.restfullwebservices.Controllers;

public class HelloWorldBean {

    private String message;

    public HelloWorldBean(String helloWorld) {
        this.message = helloWorld;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
