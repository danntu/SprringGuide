package com.example.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryExample {
    public static void main(String[] args) {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        HelloWorld helloWorld = (HelloWorld) beanFactory.getBean("helloWorld");
        helloWorld.getMessage();
    }
}
