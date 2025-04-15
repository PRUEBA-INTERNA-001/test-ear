package com.example.ejb;

import jakarta.ejb.Remote;

@Remote
public interface HelloWorld {
    String sayHello();
}