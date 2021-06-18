package com.annasladkykh.lesson11;

import java.io.IOException;
import java.io.PrintWriter;

public class WriteDemo {
    public static void main(String[] args) {
        String name = "Tina";

        String path = "D:/IdeaProjects/Telesens Academy 2/src/main/java/com/annasladkykh/lesson11/name-written.txt";

        try (PrintWriter pw = new PrintWriter(path)) {
            pw.println(name);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
