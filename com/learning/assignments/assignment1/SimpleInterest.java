package com.learning.assignments.assignment1;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculating the Simple Interest");
        System.out.println("Enter the Principal Amount");
        double principalAmt = sc.nextDouble();

        System.out.println("Enter the rate of interest per annum (p.a)");
        double rateOfInterest = sc.nextDouble();

        System.out.println("Enter the Time period (only in years) ");

        int timePeriod = sc.nextInt();
        while(timePeriod <= 0){
            System.out.println("Time period should be atleast 1 year, please enter the right time period!!");
            timePeriod = sc.nextInt();
        }

        System.out.println("Calculating the Simple Interest ...... !! ");
        double simpleInterest = (principalAmt * rateOfInterest * timePeriod) / 100;
        System.out.println(simpleInterest);

        System.out.println("Below is the detailed breakup of the Interest");
        System.out.println("===".repeat(30));
        System.out.printf("Principal Amount     - %30.2f (rupees)%n", principalAmt);
        System.out.printf("Rate of Interest     - %30.2f (pa)%n", rateOfInterest);
        System.out.printf("Time Period          - %30d (years)%n", timePeriod);
        System.out.println("---".repeat(30));
        System.out.printf("Total Interest       - %30.2f (rupees)%n", simpleInterest);
        System.out.println("---".repeat(30));
        System.out.println("===".repeat(30));
        System.out.printf("Total Amount         - %30.2f (rupees)%n", (principalAmt+simpleInterest));
        System.out.println("===".repeat(30));


    }

}
