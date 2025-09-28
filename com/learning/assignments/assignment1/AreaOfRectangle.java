package com.learning.assignments.assignment1;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Calculating the area of Rectangle\n");
        System.out.print("Please enter the Length of the rectangle: \n");
        double length = sc.nextDouble();
        System.out.print("Please enter the Width of the rectangle: \n");
        double width = sc.nextDouble();
        double area = length*width;
        System.out.printf("Length of the rectangle with length=%f and Width=%f is %.2f", length, width, area);

    }

}
