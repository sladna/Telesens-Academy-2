package com.annasladkykh.lesson2;

public class Methods {
    public static void main(String[] args) {
        System.out.println("test");
        System.out.println(sumDigits(1234));
    }
    public static int sumDigits(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
