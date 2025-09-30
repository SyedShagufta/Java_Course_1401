package com.learning.assignments.assignment3;

import java.util.Scanner;

public class PrintWeekDayOrWeekend {

    public static void main(String[] args) {
        System.out.println("Checking if the day entered is week day or weekend");
        System.out.println("===".repeat(30));
        System.out.println("Enter the day you want to check");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if(day > 0 && day < 6){
            System.out.println("It is a weekday!");
        }else if(day == 6 || day == 7){
            System.out.println("It is a weekend! Enjoy your weekend");
        }else{
            System.out.println("Invalid day, please try again");
        }
    }

}
