package com.learning.finalAssignments.conditionalStatements_02;

import java.util.Scanner;

public class PositiveOrNegativeNumbers_03 {

    public static void main(String[] args) {
        System.out.println("Positive or Negative Numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num1 = sc.nextInt();

        if(num1 >= 0){
            System.out.println(num1+" is a positive number");
        }else{
            System.out.println(num1+" is a negative number");
        }

    }

}
