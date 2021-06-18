package com.annasladkykh.lesson7;

import com.annasladkykh.lesson4.Person;

public class Genius extends Person implements Developer, Boxer{

    @Override
    public void boxing() {
        System.out.println("boxing 3 times per week");
    }

    @Override
    public void codding() {
        System.out.println("coding every day");

    }

    @Override
    public void codeReviewing() {
        System.out.println("codding reviewing sometimes");
    }

    @Override
    public String toString() {
        return "Genius";
    }
}
