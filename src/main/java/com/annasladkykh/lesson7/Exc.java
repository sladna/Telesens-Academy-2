package com.annasladkykh.lesson7;

import com.annasladkykh.lesson4.Gender;
import com.annasladkykh.lesson4.Person;

public class Exc {
    public static void main(String[] args) {
        String data = "Ivan,Ivanov,26,m";
        String[] fields = data.split(",");

        Person person = new Person();
        person.setFirstName(fields[0]);
        person.setLastName(fields[1]);
        int age = Integer.parseInt(fields[2]);
        person.setAge(age);
        person.setGender(parse(fields[3]));
        System.out.println(person);

    }

    private static Gender parse(String value) {
        if (value.equals("m"))
            return Gender.MALE;

        if (value.equals("f"))
            return Gender.FEMALE;

        return null;
    }
}