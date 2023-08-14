package com.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    @Value("${message}")
    private String message;

 
    public void printMessage() {
        System.out.println(message);
    }
    
    @PostConstruct
    public void initMethod() {
    	System.out.println("initMethod called");
    }
    
    @PreDestroy
    public void destroyMethod() {
    	System.out.println("destroyMethod called");
    }
}
