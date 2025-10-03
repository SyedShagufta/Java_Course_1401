package com.learning.assignments.assignment4;

import java.util.Scanner;

public class PrintValues1toN {

    public static void main(String[] args) {

        System.out.println("Print 1 to N numbers program");
        System.out.println("===".repeat(30));

        System.out.println("Please enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            System.out.print(i+" ");
        }

    }

}
