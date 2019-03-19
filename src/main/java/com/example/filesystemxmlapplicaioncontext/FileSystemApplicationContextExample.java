package com.example.filesystemxmlapplicaioncontext;

import com.example.annotationconfigapplicationcontext.Entitlement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FileSystemApplicationContextExample {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new FileSystemXmlApplicationContext("src/main/resources/file.xml");
        Entitlement entitlement = applicationContext.getBean("file", Entitlement.class);
        System.out.println(entitlement.getName());
        System.out.println(entitlement.getTime());
    }
}
