package com.annasladkykh.lesson12;

import com.annasladkykh.lesson4.Gender;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/subscribers?user=root&password=root";
        String sqlSelect = "select * from subscriber";
        String sqlInsert = "insert into subscriber " +
                "(first_name, last_name, age, gender) " +
                "values(?, ?, ?, ?)";
        String sqlUpdate = "update subscriber set age = ? where subscriber_id = ?";
        String sqlDelete = "delete from subscriber where subscriber_id = ?";

        try (Connection connection = DriverManager.getConnection(url)) {
            //insert
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
            preparedStatement.setString(1,"Вася");
            preparedStatement.setString(2, "Кириленко");
            preparedStatement.setInt(3,18);
            preparedStatement.setString(4, "m");
            //preparedStatement.execute();
            //preparedStatement.close();

            //update
            PreparedStatement preparedStatement1 = connection.prepareStatement(sqlUpdate);

            preparedStatement1.setInt(1,19);
            preparedStatement1.setInt(2,17);

            preparedStatement1.execute();
            preparedStatement1.close();

            //delete
            PreparedStatement preparedStatement2 = connection.prepareStatement(sqlDelete);
            preparedStatement2.setInt(1,19);
            preparedStatement2.execute();

            preparedStatement2.setInt(1,18);
            preparedStatement2.execute();
            preparedStatement2.close();


            //select
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlSelect);

            while ((resultSet.next()) != false) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");;
                int age = resultSet.getInt("age");
                Gender gender = Gender.parse(resultSet.getString("gender"));

                System.out.printf("%s %s %d %s %n",
                        firstName, lastName, age, gender);
            }

            statement.close();
            resultSet.close();
//            resultSet.next();//переводим курсор на первую полученную строку
//            String firstName = resultSet.getString("first_name");
//            String lastName = resultSet.getString("last_name");;
//            int age = resultSet.getInt("age");
//            Gender gender = Gender.parse(resultSet.getString("gender"));
//
//            System.out.println(firstName);
//            System.out.println(lastName);
//            System.out.println(age);
//            System.out.println(gender);

        } catch (SQLException e) {
            System.out.println("Connection error. Details: " + e.getMessage());
        }
    }
}
