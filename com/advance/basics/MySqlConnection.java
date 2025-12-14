package com.advance.basics;

import java.sql.*;

public class MySqlConnection {


    public static Connection getMysqlConnection()
    {
        Connection connection=null;
        try{
            // Register a JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            System.out.println("Trying to connect to a database..");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/course_1462", "root", "root");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }


}
