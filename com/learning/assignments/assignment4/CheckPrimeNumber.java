package com.learning.assignments.assignment4;

import java.util.Scanner;

public class CheckPrimeNumber {

    public static void main(String[] args) {
        System.out.println("Program to check if the given number is prime or not");
        System.out.println("===".repeat(30));

        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

            for(int i=2; i<=num; i++){
                if(num%i==0){
                    count++;
                }
            }

        if(count==2){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a prime Number");
        }

    }

}
