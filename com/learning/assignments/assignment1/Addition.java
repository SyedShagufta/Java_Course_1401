package com.learning.assignments.assignment1;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first num to perform addition: ");
        int num1 = sc.nextInt();
        System.out.print("Please enter the second num to perform addition: ");
        int num2 = sc.nextInt();
        int add = num1+num2;
        System.out.printf("%nThe Addition of the given two numbers %d and %d is %d%n", num1, num2, add);

    }

}
