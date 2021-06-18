package com.annasladkykh.lesson8.hometask;

import com.annasladkykh.Homework4Task1.CustomDate;


public class CustomDateDemo {
    public static void main(String[] args) {
        try {
            CustomDate customDate2 = new CustomDate(29, 2, 2019);
            System.out.println(customDate2);
        } catch (Exception e) {
            System.out.println("Date doesn't exist");
        }
    }
}
