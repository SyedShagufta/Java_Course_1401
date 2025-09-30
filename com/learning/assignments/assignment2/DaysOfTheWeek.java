package com.learning.assignments.assignment2;

import java.util.Scanner;

public class DaysOfTheWeek {

    public static void main(String[] args) {

        System.out.println("Printing the day of the week");
        System.out.println("===".repeat(30));
        System.out.println("Please enter the day number");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        System.out.println("Day "+day+" is "+printDayOfTheWeek(day));

    }

    public static String printDayOfTheWeek(int day){
        switch (day){
            case 1 :
                return "Monday";
            case 2 :
                return "Tuesday";
            case 3 :
                return "Wednesday";
            case 4 :
                return "Thursday";
            case 5 :
                return "Friday";
            case 6 :
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid day";
        }
    }


}
