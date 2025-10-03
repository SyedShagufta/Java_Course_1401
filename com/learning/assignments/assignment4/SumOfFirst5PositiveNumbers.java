package com.learning.assignments.assignment4;

public class SumOfFirst5PositiveNumbers {

    public static void main(String[] args) {

        System.out.println("Sum of first five positive numbers program ");
        System.out.println("===".repeat(30));
        int sum = 0;
        for(int i=1; i<=5; i++){
            sum += i;
        }

        System.out.println(sum);


    }

}
