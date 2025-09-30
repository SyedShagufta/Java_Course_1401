package com.learning.assignments.assignment2;

import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        System.out.println("Finding Greater Number Program");
        System.out.println("===".repeat(30));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println(num1+" is greater than "+num2);
        }else{
            System.out.println(num2+" is greater than "+num1);
        }

    }

}
