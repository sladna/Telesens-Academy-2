package com.annasladkykh.lesson9.hometask9;

import com.annasladkykh.lesson4.Person;

public class GenericArrayDemoPerson {
    public static void main(String[] args) {
        GenArray<Person> genArrayPerson = new GenArray<>(new Person[10]);
        Person person = new Person();
        person.setFirstName("Vasya");

        genArrayPerson.set(2, person);
        String actualValue = genArrayPerson.get(2).getFirstName();
        String expectedValue = "Vasya";
        assert actualValue.equals(expectedValue);


    }
}
