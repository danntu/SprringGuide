package com.example.brovko.lesson5;

import com.example.brovko.lesson5.impls.robot.ModelT1000;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ModelT100Config.class);
        context.refresh();

        ModelT1000 t1000 = context.getBean("t1000",ModelT1000.class);
        t1000.dance();

        ModelT1000 t1000sony = context.getBean("t1000sony",ModelT1000.class);
        t1000sony.action();

        System.out.println();

        ModelT1000 t1000toshiba = context.getBean("t1000toshiba",ModelT1000.class);
        t1000toshiba.action();
    }
}
