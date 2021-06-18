package com.annasladkykh.lesson8;

public class RuntimeExceptionDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result1 = calc.sumPositiveNumbers(1,2);
        System.out.println(result1);
        int result2 = calc.sumPositiveNumbers(-1,2);
        System.out.println(result2);
    }
}
