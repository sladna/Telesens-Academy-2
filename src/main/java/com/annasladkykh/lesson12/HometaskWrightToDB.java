package com.annasladkykh.lesson12;

import com.annasladkykh.lesson4.Person;
import com.annasladkykh.lesson7.homework.PersonGenerate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HometaskWrightToDB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/subscribers?user=root&password=root";
        String sqlInsert = "insert into subscriber " +
                "(first_name, last_name, age, gender) " +
                "values(?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(url)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
            for (int i = 0; i < 20; i++) {
                Person person = new Person();
                person = PersonGenerate.nextPerson(4, 90);
                preparedStatement.setString(1, person.getFirstName());
                preparedStatement.setString(2, person.getLastName());
                preparedStatement.setInt(3, person.getAge());
                preparedStatement.setString(4, person.getGender().toString());
                preparedStatement.execute();
            }
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Connection error. Details: " + e.getMessage());
        }
    }
}