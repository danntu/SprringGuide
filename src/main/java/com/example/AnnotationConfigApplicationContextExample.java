package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(AppConfig.class);
        annotationConfigApplicationContext.refresh();

        Entitlement entitlement = (Entitlement) annotationConfigApplicationContext.getBean("entitlement");
        entitlement.setName("Entitlement");
        entitlement.setTime(20);

        System.out.println(entitlement.getName());
        System.out.println(entitlement.getTime());
    }
}
