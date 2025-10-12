package com.learning.finalAssignments.VariablesAndDataTypes_01;

import java.util.Scanner;

public class Addition_02 {
    public static void main(String[] args) {
        System.out.println("Addition of two numbers program");
        System.out.println("===".repeat(30));
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Please enter second number: ");
        int n2 = sc.nextInt();
        System.out.println("Sum of the given two numbers is : "+(n1+n2));
    }
}
