package com.example.constructordi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.beans.ConstructorProperties;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ExampleBean {
    private int years;
    private String ultimateAnswer;

    //@ConstructorProperties({"years","ultimateAnswer"})
}
