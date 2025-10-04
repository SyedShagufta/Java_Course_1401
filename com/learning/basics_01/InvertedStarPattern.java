package com.learning.basics_01;

import java.util.Scanner;

public class InvertedStarPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            // print spaces
            for (int s = 0; s < n - i; s++) {
                System.out.print("  ");
            }

            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


    }

}
