package com.annasladkykh.lesson5.Hometask;

public class CustomDateTime extends CustomDate {
    private int hour;
    private int minute;
    private int second;

    public CustomDateTime(int day, int month, int year, int hours, int minutes, int seconds) {
        super(day, month, year);
        this.hour = hours;
        this.minute = minutes;
        this.second = seconds;
    }

    public CustomDateTime() {

    }

    @Override
    public String toString() {
        return super.toString() + " CustomDateTime{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
