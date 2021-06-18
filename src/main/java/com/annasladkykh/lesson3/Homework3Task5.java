package com.annasladkykh.lesson3;

/*
5) Реализовать программу, которая:
	- считывает строку
	- меняет местами порядок символов (напр. "abcd" => "dcba")
	- выводит исходную строку
	- выводит перевернутую строку

 */

import java.util.Arrays;

public class Homework3Task5 {
    public static void main(String[] args) {
        String str = "abcdefg";
        char[] test = str.toCharArray();
        System.out.println(Arrays.toString(test));
        for (int i = 0; i < test.length; i++) {

        }

        // Развернуть строку
        String str2 = "abcd";
        String reversed = "";
        for (int i = str2.length() - 1; i >= 0; i--) {
            reversed += str2.charAt(i);
        }
        System.out.println(reversed);

        // Проверить палиндром
        String str3 = "abcdcba";
    }

    public static boolean isPalindrome(String str) {

        for (int first = 0, last = str.length() - 1; first <= last; first++, last--) {
            if (str.charAt(first) != str.charAt(last)) {
                return false;
            }
        } //end for
        return true;
    }
}
