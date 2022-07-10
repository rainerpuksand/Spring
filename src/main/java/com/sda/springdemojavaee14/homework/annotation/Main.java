package com.sda.springdemojavaee14.homework.annotation;

import net.bytebuddy.utility.StreamDrainer;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        PersonWithAllSourceCode me = new PersonWithAllSourceCode();
        me.setName("Rainer");
        me.setSurname("Puksand");
        me.setAge(45);

        System.out.println("me: " + me.toString());

        Person meAgain = new Person("mariusz", "Pastuszka", 39);
        // builder is better than all args constructor - because You can see more:)
        Person meAgainWithBuilder = Person.builder()
                .age(39)
                .surname("Pastuszka")
                .name("Mariusz")
                .build();

        //set doesn't store duplicates
        Set<PersonWithAllSourceCode> uniquePersons = new HashSet<>();


    }


}