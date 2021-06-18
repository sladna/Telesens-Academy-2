package com.annasladkykh.lesson3;

/*
1) Напишите программу, которая:
	- считывает строку
	- выводит исходную строку
	- выводит количество и список слов, которые начинаются на букву 'd'
 */

import java.util.Arrays;

public class Homework3Task1 {

    public static void main(String[] args) {
        String words = "domino,endurance,dark,shark,device,contain,dragon";
        String[] wordsArray = words.split(",");
        printWordsStartedFromLetter(wordsArray);
    }

    public static void printWordsStartedFromLetter(String[] initialString) {
        System.out.println("Initial string is: " + Arrays.toString(initialString));
        int quantity = 0;
        for (int i = 0; i < initialString.length; i++) {
            if (initialString[i].startsWith("d")) {
                quantity += 1;
                System.out.println(initialString[i]);
            }
        }
        System.out.println(quantity + " words start with 'd'");
    }
}