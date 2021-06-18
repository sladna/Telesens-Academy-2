package com.annasladkykh.Homework4Task1;

import com.annasladkykh.lesson8.hometask.IllegalDateException;

public class CustomDate {
    private int day;
    private int month;
    private int year;

    public CustomDate(int day, int month, int year) {
        if (month < 1 || month > 12) {
            throw new IllegalDateException();
        }

        if (month == 2 && day >29) {
            throw new IllegalDateException();
        }

        if (!((year % 4 == 0)
                && (year % 100 != 0)
                || (year % 400 == 0))
                && (month == 2)
                && (day == 29)) {
            throw new IllegalDateException();
        }

        if (day < 1 || day > 31) {
            throw new IllegalDateException();
        }

        if (year < 0000) {
            throw new IllegalDateException();
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "CustomDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public String getFormattedDate() {
        return day + "." + month + "." + year;
    }

    public static void validate(int day, int month, int year) {
        if (month % 2 == 0 && month >= 1 && month <= 12) {
            if (day >= 01 && day <= 30) {
                if (year > 0000 && year <= 2021) {
                    System.out.println(day + "." + month + "." + year + " date is valid");
                } else System.out.println("Invalid YEAR");
            } else System.out.println("Invalid DAY");
        } else if (month % 2 != 0 && month >= 1 && month <= 12) {
            if (day >= 01 && day <= 31) {
                if (year > 0000 && year <= 2021) {
                    System.out.println(day + "." + month + "." + year + " date is valid");
                } else System.out.println("Invalid YEAR");
            } else System.out.println("Invalid DAY");
        } else System.out.println("Invalid MONTH");
    }
}