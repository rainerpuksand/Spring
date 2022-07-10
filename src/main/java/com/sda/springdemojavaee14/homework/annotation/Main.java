package com.sda.springdemojavaee14.homework.annotation;

import net.bytebuddy.utility.StreamDrainer;

public class Main {

    public static void main(String[] args) {
        PersonWithAllSourceCode me = new PersonWithAllSourceCode();
        me.setName("Rainer");
        me.setSurname("Puksand");
        me.setAge(45);

        System.out.println("me: " + me.toString());




    }


}