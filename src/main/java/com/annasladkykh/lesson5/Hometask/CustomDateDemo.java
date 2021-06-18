package com.annasladkykh.lesson5.Hometask;

public class CustomDateDemo {
    public static void main(String[] args) {
        CustomDate date = new CustomDate();
        CustomDate date2 = new CustomDate(23, 3, 2020);
        CustomDate date3 = new CustomDate(23, 3, 2020);
        System.out.println(date);
        System.out.println(date3);

        System.out.println(date.equals(date2)); //false
        System.out.println(date2.equals(date3)); //true

        CustomDateTime dateTime = new CustomDateTime();
        CustomDateTime dateTime1 = new CustomDateTime();
    }
}
