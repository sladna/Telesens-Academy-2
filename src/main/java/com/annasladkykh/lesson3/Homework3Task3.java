package com.annasladkykh.lesson3;

/*
3) Напишите программу, которая:
	- считывает строку
	- считывает подстроку
	- выводит исходные строку и подстроку и выводит кол-во вхождений строки в подстроку
 */

public class Homework3Task3 {
    public static void main(String[] args) {
        String str = "ABcABDeAB";
        String target = "AB";

        System.out.println(str.indexOf(target, 2));
        int count = 0;
        int index = str.indexOf(target);
        while (index != -1) {
            count++;
            index = str.indexOf(target, +2);
        }
        System.out.println(count); //3
    }
}