package com.learning.basics_01;

import java.util.Scanner;

public class ArmstrongNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Checking Armstrong Number Program: ");
        System.out.println("===".repeat(30));
        System.out.println("Please enter the number to check: ");
        int num = sc.nextInt();
        int temp = num;
        int result=0;
        while(num!=0)
        {
            int rem = num%10;
            result = result + (rem * rem * rem);
            num=num/10;

        }

        if(temp == result) {
            System.out.println("Yes, It is Armstrong number");
        } else{
            System.out.println("No, It is not an Armstrong number");
        }

    }

}
