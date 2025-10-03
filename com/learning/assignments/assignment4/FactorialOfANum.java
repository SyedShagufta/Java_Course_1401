package com.learning.assignments.assignment4;

import java.util.Scanner;

public class FactorialOfANum {

    public static void main(String[] args) {
        System.out.println("Factorial of a number Program");
        System.out.println("===".repeat(30));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int fact = 1;
        // factorial of 5
        // 5 ! = 5 * (5 -1) * (5-2) * (5-3) * (5-4)
        for(int i = 1; i<=num ; i++){
            fact *=  i;
        }

        System.out.println("Factorial of "+num+" is "+fact);

    }

}
