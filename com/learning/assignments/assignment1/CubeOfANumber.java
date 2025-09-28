package com.learning.assignments.assignment1;

import java.util.Scanner;

public class CubeOfANumber {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Calculating the cube of a Number");
        int num = sc.nextInt();
        int cubeOfNum = (int) Math.pow(num, 3);

        System.out.printf("The cube of the number %d is %d ", num, cubeOfNum);

    }

}
