package com.learning.assignments.assignment1;

import java.util.Scanner;

public class EmployeeDetails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter you details !!!");
        System.out.print("Please enter your name : ");
        String empName = sc.nextLine();
        System.out.printf("%nPlease enter your employee id: ");
        int empId = sc.nextInt();
        System.out.printf("%nPlease enter your job title: ");
        sc.nextLine();
        String jobTitle = sc.nextLine();
        System.out.printf("%nPlease enter your salary p.a: ");
        double salary = sc.nextDouble();
        System.out.println("Below are your Employee Details!!!");
        System.out.println("===".repeat(30));
        System.out.printf("Employee Name:       %20s%n",empName);
        System.out.printf("Employee Id:         %20d%n",empId);
        System.out.printf("Job Title:           %20s%n",jobTitle);
        System.out.printf("Salary:              %20.2f%n",salary);
        System.out.println("---".repeat(30));

    }

}
