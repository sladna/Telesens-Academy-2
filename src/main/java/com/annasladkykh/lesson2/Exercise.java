package com.annasladkykh.lesson2;

public class Exercise {
    public static void main(String[] args) {
        String[] tracks = {"track_01", "track_03", "track_21", "track_15", "track_12", "track_99", "track_11", "track_10"};
        for (int i = 0; i < tracks.length; i++) {
//            String lastDigits = tracks[i].substring(6);
//            System.out.println(lastDigits);
//            System.out.println(tracks[i]);
//            Integer number = Integer.parseInt(lastDigits);

            Integer number = detectTrackNumber(tracks[i]);

            if (number >= 10 && number <= 15) {
                System.out.println(tracks[i]);
            }
        }
    }

    public static int detectTrackNumber(String track) {
        String lastDigits = track.substring(6);
        Integer number = Integer.parseInt(lastDigits);
        return number;
    }
}