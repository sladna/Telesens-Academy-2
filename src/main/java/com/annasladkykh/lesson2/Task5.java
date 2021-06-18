package com.annasladkykh.lesson2;

/*
5)*
	В переменной n хранится натуральное трёхзначное число.
	Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
	Пример:
			n = 234;
			sum = 9;  (2+3+4)

		- прочитать число с консоли
		- проверить, что число трезначное
		- вывести исходное число
		- вывести сумму цифр
 */

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        System.out.println("Type three-digit number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 100 && n < 1000) {
            System.out.println("Your number is " + n);
            int firstDigit = n / 100;
            int secondDigit = n / 10 % 10;
            int thirdDigit = n % 10;
            int sum = firstDigit + secondDigit + thirdDigit;
            System.out.println("Sum of numbers is " + sum);
        } else System.out.println("It is not three-digit number");
    }
}