package com.learning.assignments.assignment4;

import java.util.Scanner;

public class PrintValuesBetween2Nums {

    public static void main(String[] args) {

        System.out.println("Print the values between 2 numbers: ");
        System.out.println("===".repeat(30));

        Scanner sc = new Scanner(System.in);
        System.out.println("Give me the first number : ");
        int num1 = sc.nextInt();

        System.out.println("Give me the second number : ");
        int num2 = sc.nextInt();

        for(int i=num1+1; i<num2; i++){
            System.out.print(i+" ");
        }

    }

}
