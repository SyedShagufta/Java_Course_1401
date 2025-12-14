package com.advance.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionSetup {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		// show databases;
		// create database test;
		// use test;
		// ignore: create user test identified by 'test';
		// ignore: GRANT ALL PRIVILEGES ON *.* TO 'test'@'localhost' IDENTIFIED BY 'test' WITH GRANT OPTION;
		// create table emp (empid numeric, name varchar(50),dept varchar(20), sal numeric);
		// insert into emp values(101, 'test employee','test Dept', 1000);
		try {
			// Register JDBC driver
			/*
			 * Class.forName("com.mysql.cj.jdbc.Driver");
			 * 
			 * // Open a connection System.out.println("Connecting to database..."); conn =
			 * DriverManager.getConnection("jdbc:mysql://localhost/test", "test", "test");
			 */
			// java -version
			
			conn = MySqlConnection.getSQLConnection();

			// Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql = "SELECT empid, name,dept, sal FROM Emp";
			ResultSet rs = stmt.executeQuery(sql);

			System.out.println("EmpID    | Name    | Dept | Salary");
			// Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				int empId = rs.getInt(1);
				String name = rs.getString(2);
				String dept = rs.getString(3);
				int sal = rs.getInt(4);

				System.out.print(empId);
				System.out.print(" | " + name);
				System.out.print(" | " + dept);
				System.out.println(" | " + sal);
			}

			// Clean-up environment
			rs.close();
			stmt.close();
			conn.close();

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		}
		System.out.println("That's all i had!");
	}



}