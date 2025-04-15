package com.example.ejb;

import jakarta.ejb.Stateless;

@Stateless
public class HelloWorldBean implements HelloWorld {
    public String sayHello() {
        return "Hello World from EJB!";
    }
}