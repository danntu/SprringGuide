package com.example.factorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpringStaticFactoryMethod {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        EmployeeDTO manager = context.getBean("manager", EmployeeDTO.class);
        showMessage(manager);
        System.out.println();
        EmployeeDTO director = context.getBean("director", EmployeeDTO.class);
        showMessage(director);

    }

    private static void showMessage(EmployeeDTO employee) {
        System.out.println(employee.getId());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getDesignation());
    }
}
