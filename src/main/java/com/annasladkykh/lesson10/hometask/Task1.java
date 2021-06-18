package com.annasladkykh.lesson10.hometask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        String[] names = {"Peter", "Helen", "Andry", "Abdel", "Kate", "Veronica", "Leonid", "Alex", "max"};

        //Создать список List из элементов массива и вывести на экран

        // 1 способ из массива коллекцию
        List<String> listNames = new ArrayList<>();
        listNames.addAll(Arrays.asList(names)); // из массива коллекцию
        System.out.println(listNames);

        // 2 способ
        List<String> listNames2 = new ArrayList<>(Arrays.asList(names));
        System.out.println(listNames2);

        //Добавить 3 новых имени в список (Philip, Joseph, Leon) и вывести весь список на экран
        listNames.add("Philip");
        listNames.add("Joseph");
        listNames.add("Leon");

        //Удалить из списка все имена: Veronica, Leonid и вывести на экран
        listNames.remove("Veronica");
        listNames.remove("Leonid ");
        System.out.println(listNames);

        for (int i = 0; i < listNames.size(); i++) {
            System.out.println(listNames.get(i));
        }

        //Поменять имя Helen на Elizabet
        listNames.set(listNames.indexOf("Helen"), "Elizabeth");

        //Отсортировать имена по алфавиту и вывести на экран
        listNames.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(listNames);

        //Отсортировать имена в обратном порядке и вывести имена на экран
        listNames.sort((o1, o2) -> o2.compareTo(o1));
        System.out.println(listNames);

        //Перевести все первые символы в верхний регистр
        listNames.replaceAll(String::toUpperCase);
        System.out.println(listNames);

        //h) Вывести все имена, начинающиеся на букву A
        for (int i = 0; i < listNames2.size(); i++) {
            if(listNames2.get(i).startsWith("A")){
                System.out.println(listNames2.get(i));
            }

        }

        //Проверить, содержит ли список имя Andry
        System.out.println(listNames2.contains("Andry"));

        //Удалить из списка все имена кроме Kate и Helen
        //it=iterator
        //it.remove();
        //retain
        System.out.println("-----" + listNames2);
        for (int i = 0; i < listNames2.size(); i++) {
            if (!(listNames2.get(i).equals("Kate"))) {
                listNames2.remove(i);
            }
        }
        System.out.println(listNames2);
    }
}