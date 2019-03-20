package com.example.constructordi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constuctordi.xml");

        ExampleBean bean1 = context.getBean("exampleBean1", ExampleBean.class);
        showMessage(bean1);

        ExampleBean bean2 =  context.getBean("exampleBean2", ExampleBean.class);
        showMessage(bean2);

        ExampleBean bean3 = context.getBean("exampleBean3", ExampleBean.class);
        showMessage(bean3);
    }

    public static void showMessage(ExampleBean exampleBean){
        System.out.println(exampleBean.getYears());
        System.out.println(exampleBean.getUltimateAnswer());
    }
}
