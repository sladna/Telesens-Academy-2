package com.annasladkykh.lesson10;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(10, "ten");
        map.put(10, "eleven");
        map.put(5, "five");

        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.get(10));
        System.out.println(map.get(11));

        // Получить только ключи
        System.out.println(map.keySet());
        Set<Integer> keys = map.keySet();
        List<Integer> listKeys = new ArrayList<>(keys);

        // Получить только значения
        System.out.println(map.values());

        // 1 способ
        System.out.println("--1 способ--");
        for (int i = 0; i < listKeys.size(); i++) {
            int key = listKeys.get(i);
            String value = map.get(key); // "one";
            System.out.println(key + ":" + value);
        }

        // 2 способ через итератор
        System.out.println("--2 способ--");
        Iterator<Integer> iterator = keys.iterator();

        while (iterator.hasNext()) { // если есть след. элемент
            Integer key = iterator.next(); // читаем след.
            String value = map.get(key); // "one";
            System.out.println(key + ":" + value);
        }

        // 3 способ через итератор
        System.out.println("--3 способ--");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> entryIterator = entries.iterator();

        while (entryIterator.hasNext()) { // если есть след. элемент
            Map.Entry<Integer, String> entry = entryIterator.next();
            Integer key = entry.getKey(); // читаем след.
            String value = entry.getValue(); // "one";
            System.out.println(key + ":" + value);
        }

        // 4 способ через foreach (рекомендуемый)
        System.out.println("--4 способ--");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey(); // читаем след.
            String value = entry.getValue(); // "one";
            System.out.println(key + ":" + value);
        }

        // 5 ДЗ - map.entrySet() - не используя foreach,
        // а обычный for (int i = 0;...), используя вспомогательный ArrayList
    }
}