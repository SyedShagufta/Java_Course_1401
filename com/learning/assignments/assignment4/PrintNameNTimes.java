package com.learning.assignments.assignment4;

import java.util.Scanner;

public class PrintNameNTimes {

    public static void main(String[] args) {
        System.out.println("Printing name N times program");
        System.out.println("===".repeat(30));

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name you want to print: ");
        String name = sc.nextLine();

        System.out.println("Please enter the number of times you want to print the name: ");
        int n = sc.nextInt();

        for(int i=0; i<=n-1; i++){
            System.out.println(name);
        }

    }

}
