package com.example.beanfactory;

import lombok.Setter;

@Setter
public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("Your message " + message);
    }
}
