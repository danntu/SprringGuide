package com.example.brovko.lesson5;

import com.example.brovko.lesson5.impls.robot.ModelT1000;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelT100Config {

    @Bean(name = "t1000")
    public ModelT1000 getModelT1000(){
        return new ModelT1000();
    }
}
