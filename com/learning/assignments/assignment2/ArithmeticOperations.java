package com.learning.assignments.assignment2;

import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {
        System.out.println("Arithmetic Operations");
        System.out.println("===".repeat(30));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the operation you want to perform ( + , - , / , * , % )");
        char s = sc.next().charAt(0);
        System.out.println("---".repeat(30));
        System.out.printf("%d %s %d = %.2f%n", num1, s, num2, performOperation(num1, num2,s));
        System.out.println("---".repeat(30));
    }


    public static double performOperation(int num1, int num2, char op)
    {
       return switch (op)  {
           case '+' -> num1 + num2;
           case '-' -> num1 - num2;
           case '*' -> num1 * num2;
           case '/' -> (double) num1 / num2;
           case '%' -> num1 % num2;
           default ->
                   {
                       System.out.println("Invalid Operation so returning default value");
                       yield 0.0;
                   }
       };
    }

}
