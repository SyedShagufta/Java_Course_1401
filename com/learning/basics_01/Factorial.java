package com.learning.basics_01;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        // factorial of a number
        System.out.println("Factorial of a Number Program ");
        System.out.println("===".repeat(30));
        System.out.println("Please enter a number to find factorial");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;

        for(int i=1; i<=num;i++){
            fact = fact * i;
        }

        System.out.println("Factorial of "+num+" is "+fact);

    }

}
