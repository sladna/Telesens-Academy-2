package com.annasladkykh.lesson11;

import java.io.*;

public class ReadDemo {
    public static void main(String[] args) {
        String path = "D:/IdeaProjects/Telesens Academy 2/src/main/java/com/annasladkykh/lesson11/name.txt";


        // 2 способ
        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {
            String name;
            while ((name = br.readLine()) != null) {
                System.out.println(name);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}