package com.sda.springdemojavaee14.homework.annotation;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //generatates all getters/setters, toString, equals, hascode
@AllArgsConstructor // generates constructor for all fileds in order their declaration
@NoArgsConstructor // generates default constructor
@Builder
public class Person {

    private String name;

    private String surname;

    private int age;


}
