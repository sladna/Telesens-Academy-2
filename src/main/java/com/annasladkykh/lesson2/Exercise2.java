package com.annasladkykh.lesson2;

import java.util.Arrays;
import java.util.Locale;

public class Exercise2 {
    public static void main(String[] args) {
        String data = "petrov,Ivanov ,KiRill, Helen ";
        // => [Petrov,Ivanov,Kirill,Helen]
        String[] names = data.split(",");
        System.out.println(Arrays.toString(names));
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            //обрезаем пробелы
            name = name.trim();
            //Первый символ в верхний регистр
            char firstLetter = name.charAt(0);
            firstLetter = Character.toUpperCase(firstLetter);
            //Остальные символы - в нижний
            String otherLetter = name.substring(1);
            otherLetter = otherLetter.toLowerCase(Locale.ROOT);

            names[i] = firstLetter + otherLetter;
        }
        System.out.println(Arrays.toString(names));
    }
}