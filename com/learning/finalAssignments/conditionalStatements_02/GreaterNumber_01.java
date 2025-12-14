package com.learning.finalAssignments.conditionalStatements_02;

import java.util.Scanner;

public class GreaterNumber_01 {

    public static void main(String[] args) {
        System.out.println("finding the greater number:");
        System.out.println("===".repeat(30));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();

        if(n1>n2){
            System.out.println(n1+" is greater than "+n2);
        }else{
            System.out.println(n2+" is greater than "+n1);
        }
    }

}
