package com.annasladkykh.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        String[] arrayStr = new String[10];
        arrayStr[0] = "first";
        arrayStr[1] = "second";
        arrayStr[4] = "fifth";
        System.out.println(arrayStr.length);
        System.out.println(Arrays.toString(arrayStr));
        System.out.println(arrayStr[2]);

        List<String> listString = new ArrayList<>();
        listString.add("first");
        listString.add("second");
        listString.add("third");
        System.out.println(listString.size());
        listString.set(1, "fifth");
        System.out.println(listString);
        System.out.println(listString.get(2)); // => 'third'
        listString.remove("fifth");
        System.out.println(listString); // [first, third]
        listString.add(1, "second");
        System.out.println(listString);

        System.out.println(listString.contains("second"));
        System.out.println(listString.indexOf("second")); // => [first, second, third];

        List<String> added = new ArrayList<>();
        added.add("next1");
        added.add("next2");
        added.add("next3");

        listString.addAll(added);
        System.out.println(listString);
        listString.removeAll(added);
        System.out.println(listString);

        List<String> retained = new ArrayList<>(Arrays.asList("first", "second", "element"));
        System.out.println(retained);
        listString.retainAll(retained);
        System.out.println(listString);
        listString.clear();
        System.out.println(listString);
    }
}