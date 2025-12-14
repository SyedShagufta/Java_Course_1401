package com.advance.basics;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        Connection connection = MySqlConnection.getMysqlConnection();

        if(connection != null){
            System.out.println("Connection established successfully!");
        }else{
            System.out.println("Connection failed! ");
        }

    }

}
