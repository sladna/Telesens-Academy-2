package com.annasladkykh.lesson3;

/*
2) Напишите программу, которая:
	- считывает строку
	- выводит исходную строку
	- выводит количество и список слов, которые заканчиваются буквами 'ED'
 */

import java.util.Arrays;

public class Homework3Task2 {
    public static void main(String[] args) {
        String words = "startED,endurance,dark,finished,device,contain,dragon";
        String[] wordsArray = words.split(",");
        System.out.println("The list of your words is " + Arrays.toString(wordsArray));
        System.out.println("Quantity of words in the list is " + wordsArray.length);
        int quantity = 0;
        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].endsWith("ED")) {
                quantity += 1;
                System.out.println(wordsArray[i]);
            }
        }
        System.out.println(quantity + " words finished with 'ED'");
    }
}