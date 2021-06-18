package com.annasladkykh.lesson11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        String path = "D:/IdeaProjects/Telesens Academy 2/src/main/java/com/annasladkykh/lesson11/женские имена.txt";

        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {
            String name;
            List<String> womanNamesList = new ArrayList<>();
            while ((name = br.readLine()) != null) {
                womanNamesList.add(name);
            }
            System.out.println(womanNamesList);
            System.out.println("---------------------------");
            womanNamesList.sort(Comparator.reverseOrder());
            System.out.println(womanNamesList);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}