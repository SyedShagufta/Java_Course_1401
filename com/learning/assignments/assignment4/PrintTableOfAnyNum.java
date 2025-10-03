package com.learning.assignments.assignment4;

import java.util.Scanner;

public class PrintTableOfAnyNum {

    public static void main(String[] args) {
        System.out.println("Printing the table program ");
        System.out.println("===".repeat(30));

        System.out.println("Enter the number to print its table: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.printf("%d x %d  = %d%n", n, i, (n*i));
        }

    }

}
