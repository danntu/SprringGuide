package com.example.setterdi;

import com.example.constructordi.ExampleBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("setterdi.xml");

        ExampleBean bean = context.getBean("exampleBeanSetter",ExampleBean.class);
        com.example.constructordi.MainApp.showMessage(bean);
    }
}
