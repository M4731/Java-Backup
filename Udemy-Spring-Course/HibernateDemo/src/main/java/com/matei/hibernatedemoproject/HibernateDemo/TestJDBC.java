package com.matei.hibernatedemoproject.HibernateDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {

    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "hbstudent";

        try {
            System.out.println("Connecting to database: "+ jdbcUrl);
            Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }



}
