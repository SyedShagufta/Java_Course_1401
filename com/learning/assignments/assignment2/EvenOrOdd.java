package com.learning.assignments.assignment2;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        System.out.println("Even or Odd Number");
        System.out.println("===".repeat(30));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println(num+" is even");
        }else{
            System.out.println(num+" is odd");
        }

    }

}
