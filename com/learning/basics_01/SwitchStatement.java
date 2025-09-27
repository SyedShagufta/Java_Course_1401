package com.learning.basics_01;

public class SwitchStatement {


    public static void main(String[] args) {

        System.out.println("Using the Old Switch statement to print days of the week");
        System.out.println("===".repeat(30));
        print("days");
        System.out.println("Using the Enhanced Switch statement to print the Months of the year ");
        System.out.println("===".repeat(30));
        print("months");
    }

    public static void print(String input)
    {
        if(input.equalsIgnoreCase("days")){
            for(int i = 1; i<=7; i++){
                System.out.printf("The Day %d of the week is %s%n", i, printDayOfTheWeek(i));
            }
        }
        else if(input.equalsIgnoreCase("months")){
            for(int i=1; i<=12; i++){
                System.out.printf("The Month %d of the year is %s%n", i, printMonthOfTheYear(i));
            }
        }
        else{
            System.out.println("Please enter a value input");
        }
    }

    public static String printMonthOfTheYear(int month){
        return switch(month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
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
