package com.annasladkykh.lesson5.Hometask;

import com.annasladkykh.lesson6.DateFormat;
import com.annasladkykh.lesson8.hometask.IllegalDateException;

import java.util.Objects;

public class CustomDate {
    private int day;
    private int month;
    private int year;

    public CustomDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        if (this.month < 1 || this.month > 12) {
            throw new IllegalDateException();
        }
    }

    public CustomDate() {
        day = 1;
        month = 1;
        year = 1970;
    }

    public String toString() {
        return day + "." + month + "." + year;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomDate date = (CustomDate) o;
        return day == date.day && month == date.month && year == date.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }


    public String getFormattedDate(DateFormat format) {
        switch (format) {
            case RU:
                return String.format("%02d.%02d.%d", day, month, year);

            case USA:
                return String.format("%02d-%02d-%d", month, day, year);

            case ENG:
                return String.format("%02d-%02d-%d", day, month, year);

            case UK:
                return String.format("%02d/%02d/%d", day, month, year);

            default:
                return "we don't know such date format";
        }

    }

//    public boolean validateMonth(int month) {
//        if (month < 1 || month > 12) {
//            throw new IllegalDateException();
//        }
//        return true;
//    }
}