package com.annasladkykh.lesson8;

public class ExceptionDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            double result = calc.div(5, 0);
            System.out.println(result);
        } catch (DivisionByZero e) {
            System.out.println("Error. Wrong argument.Division by zero");
        } finally {
            System.out.println("---finish---");
        }
    }
}
