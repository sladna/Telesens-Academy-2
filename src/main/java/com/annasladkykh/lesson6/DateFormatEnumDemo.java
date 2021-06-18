package com.annasladkykh.lesson6;

import com.annasladkykh.lesson5.Hometask.CustomDate;

public class DateFormatEnumDemo {
    public static void main(String[] args) {
        CustomDate date = new CustomDate();
        System.out.println(date.getFormattedDate(DateFormat.ENG));
        System.out.println(date.getFormattedDate(DateFormat.RU));
        System.out.println(date.getFormattedDate(DateFormat.UK));
        System.out.println(date.getFormattedDate(DateFormat.USA));
    }
}
