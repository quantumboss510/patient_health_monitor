package com.example.healthcare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static final String URL="jdbc:mysql://localhost:3306/healthcare";
    private static  final String USER="root";
    private static final String PASSWORD="thiruvathira";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
}
