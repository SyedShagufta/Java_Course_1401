package com.learning.assignments.assignment2;

import java.util.Scanner;

public class EqualNumber {

    public static void main(String[] args) {
        System.out.println("Checking if two numbers are equal or not");
        System.out.println("===".repeat(30));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        System.out.println("---".repeat(30));

        if(num1==num2){
            System.out.println("Both the numbers you entered are equal");
        }else{
            System.out.println("The numbers you entered are different");
        }

    }

}
