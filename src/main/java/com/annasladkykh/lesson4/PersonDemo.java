package com.annasladkykh.lesson4;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person();
        Person[] group = new Person[3];
        group[0] = new Person();
        group[0].setFirstName("Adam");
        group[0].setLastName("Jackson");
        group[0].setAge(25);
        //group[0].setGender('m');
        group[1] = new Person();
        group[1].setFirstName("Jack");
        group[2] = new Person();
        group[2].setFirstName("Kate");
        for (int i = 0; i < group.length; i++) {
            System.out.println(group[i].getProfile());
        }

    }
}