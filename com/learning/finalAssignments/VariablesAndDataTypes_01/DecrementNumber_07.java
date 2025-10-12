package com.learning.finalAssignments.VariablesAndDataTypes_01;

import java.util.Scanner;

public class DecrementNumber_07 {

    public static void main(String[] args) {
        System.out.println("Program to decrement the value by 3");
        System.out.println("===".repeat(30));
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("---".repeat(30));
        System.out.printf("User Input:        %20d%n",num);
        // decrementing the number by 3
        num-=3;
        System.out.printf("After decrementing:%20d%n",num);
        System.out.println("===".repeat(30));
    }

}
