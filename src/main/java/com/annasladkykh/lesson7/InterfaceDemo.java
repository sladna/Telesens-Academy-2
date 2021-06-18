package com.annasladkykh.lesson7;

import com.annasladkykh.lesson4.Person;

import java.util.Arrays;

public class InterfaceDemo {
    public static void main(String[] args) {
        MiddleDev dev = new MiddleDev();
        dev.codding();
        dev.codeReviewing();

        Developer junior = new MiddleDev();
        junior.codding();
        junior.codeReviewing();

        Developer middle = new JuniorDev();
        middle.codding();
        middle.codeReviewing();

        Boxer boxer = new Fighter();
        boxer.boxing();

        Developer genius = new Genius();
        genius.codding();
        genius.codeReviewing();

        Developer[] teamDev = new Developer[3];
        teamDev[0] = middle;
        teamDev[1] = junior;
        teamDev[2] = genius;
        System.out.println(Arrays.toString(teamDev));

        System.out.println("---exc---");
        Person[] group = {new JuniorDev(), new MiddleDev(), new Fighter(), new Genius(), new Person()};

        //перебрать массив
        //1) заставить только dev из группы сделать код-ревью
        //2) заставить только боксёров боксировать

        for (int i = 0; i < group.length; i++) {
            if (group[i] instanceof Developer)
                ((Developer) group[i]).codeReviewing();

            if (group[i] instanceof Boxer)
                ((Boxer) group[i]).boxing();
        }
    }
}