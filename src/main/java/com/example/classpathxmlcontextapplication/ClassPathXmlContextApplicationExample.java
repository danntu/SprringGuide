package com.example.classpathxmlcontextapplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlContextApplicationExample {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("student.xml");

        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student.getNo());
        System.out.println(student.getName());

        student.setName("Danik");
        student.setNo(1);

        System.out.println(student.getName());
        System.out.println(student.getNo());
    }
}
