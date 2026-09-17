package com.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/";
        String user = "developer";
        String password = "123";
        String query = "select * from user";

        Connection connection = DriverManager.getConnection(url, user, password);
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet ResultSet = preparedStatement.executeQuery(query);

        while (ResultSet.next()) {
            System.out.println(ResultSet.getString("name"));
        }
    }
}