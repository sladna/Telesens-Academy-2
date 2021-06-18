package com.annasladkykh.Homework4Task1;

public class CustomDateDemo {
    public static void main(String[] args) {
        CustomDate date = new CustomDate(12,3,21);
        System.out.println(date.getFormattedDate());
        CustomDate.validate(32,22,1000);
    }
}
