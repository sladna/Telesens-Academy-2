package com.annasladkykh.lesson10;

import java.util.Arrays;
import java.util.Comparator;

public class SortDemo {
    public static void main(String[] args) {
        String[] names = {"Peter", "Helen", "Andry",
                "Abdel", "Kate", "Veronica",
                "Leonid", "Alex", "max"};

        System.out.println(Arrays.toString(names));
        Arrays.sort(names); // сортировка по алфавиту
        System.out.println(Arrays.toString(names));

        // Arrays.sort(names, (o1, o2)->o2.compareTo(o1)); // сортировка по алфавиту в обратном порядке
        Arrays.sort(names, Comparator.reverseOrder()); // сортировка по алфавиту в обратном порядке
        System.out.println(Arrays.toString(names));


        Integer[] numbers = {4, 1, 6, 3, 7, 0};
        Arrays.sort(numbers); // сортировка по возрастанию
        System.out.println(Arrays.toString(numbers));

        // 1 способ
        // Arrays.sort(numbers, new IntegerDescComparator()); // сортировка по убыванию
//        Arrays.sort(numbers, (o1, o2)-> {
//            if (o1 < o2)
//                return 1;
//
//            if (o1 > o2)
//                return -1;
//
//            return 0;
//        });
//        Arrays.sort(numbers, (o1, o2)-> o2.compareTo(o1));
        Arrays.sort(numbers, Comparator.reverseOrder());

        System.out.println(Arrays.toString(numbers));


    }
}