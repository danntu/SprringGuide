package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "entitlement")
    public Entitlement entitlement(){
        return new Entitlement();
    }
}
