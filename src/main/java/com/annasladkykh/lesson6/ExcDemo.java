package com.annasladkykh.lesson6;

import com.annasladkykh.lesson5.Hometask.CustomDate;
import com.annasladkykh.lesson5.Hometask.CustomDateTime;

public class ExcDemo {
    public static void main(String[] args) {
        CustomDate date = new CustomDate();
        CustomDateTime dateTime = new CustomDateTime();

        CustomDate[] dateOrDateTime = {date, dateTime};
        for (int i = 0; i < dateOrDateTime.length; i++) {
            if (!(dateOrDateTime[i] instanceof CustomDateTime))
                System.out.println(dateOrDateTime[i]);

        }



    }
}
