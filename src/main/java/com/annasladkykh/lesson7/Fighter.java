package com.annasladkykh.lesson7;

import com.annasladkykh.lesson4.Person;

public class Fighter extends Person implements Boxer{

    @Override
    public void boxing() {
        System.out.println("Boxing");
    }
}
