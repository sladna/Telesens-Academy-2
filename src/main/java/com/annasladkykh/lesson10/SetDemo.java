package com.annasladkykh.lesson10;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> setString = new HashSet<>();
        setString.add("first");
        setString.add("second");
        setString.add("third");
        setString.add("third");

        System.out.println(setString.size());
        System.out.println(setString);

        // Упражнение - получить уникальные имена
        List<String> names = new ArrayList<>(Arrays.asList(
                "Peter", "Helen", "Andry", "Abdel",
                "Kate", "Helen", "Andry", "Peter"));

        Set<String> tmpNames = new HashSet<>(names);
        List<String> uniqueNames = new ArrayList<>(tmpNames);
        System.out.println(uniqueNames);
    }
}