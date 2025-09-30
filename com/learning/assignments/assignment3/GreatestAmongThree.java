package com.learning.assignments.assignment3;

import java.util.Scanner;

public class GreatestAmongThree {

    public static void main(String[] args) {
        System.out.println("Program to find greatest among three numbers!");
        System.out.println("===".repeat(30));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number : ");
        int num3 = sc.nextInt();
        System.out.println("---".repeat(30));
        int greater = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3) ? num2 : num3;
        System.out.println(greater+" is the greatest number among "+num1+", "+num2+" and "+num3);
    }

}
