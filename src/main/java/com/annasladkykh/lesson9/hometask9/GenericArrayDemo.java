package com.annasladkykh.lesson9.hometask9;

import com.annasladkykh.lesson4.Person;
import com.annasladkykh.lesson7.homework.PersonGenerate;

public class GenericArrayDemo {
    public static void main(String[] args) {
        // Создать класс GenArray<String> размера 10

        GenArray<String> genArray = new GenArray<>(new String[10]);

        // Записать 2-ой элемент "hello"

        genArray.set(1, "hello");

        // Прочитать этот элемент

        System.out.println(genArray.get(1));
        String actualValue = genArray.get(1);
        String expectedValue = "hello";
        assert actualValue.equals(expectedValue);

        // Записать 11-ый элемент "world"

        try {
            genArray.set(11, "world");
            System.out.println(genArray.get(11));
        } catch (Exception e) {
            System.out.println(e);
        }
        // Получить exception

        GenArray<Person> genArrayPerson = new GenArray<>(new Person[10]);
        for (int i = 0; i < 10; i++) {
            Person person = PersonGenerate.nextPerson(4, 90);
            genArrayPerson.set(i, person);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(genArrayPerson.get(i));
        }
    }


}