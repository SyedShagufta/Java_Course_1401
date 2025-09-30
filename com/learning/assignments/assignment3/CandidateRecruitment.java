package com.learning.assignments.assignment3;

import java.util.Scanner;

public class CandidateRecruitment {

    public static void main(String[] args) {
        System.out.println("Candidate Recruitment Program");
        System.out.println("===".repeat(30));
        System.out.println("Please enter the candidate is male (m) or female (f)");
        Scanner sc = new Scanner(System.in);
        String gender = sc.nextLine();
        System.out.println("Please enter the age of the candidate");
        int age = sc.nextInt();
        System.out.println("Please enter the height of the candidate in cm ");
        int height = sc.nextInt();
        System.out.println("---".repeat(30));
        if(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("M")){
            System.out.printf("Candidate Gender -  %20s%n", "Male");
            System.out.printf("Candidate Age -     %20d%n", age);
            System.out.printf("Candidate Height -  %20d%n", height);
            System.out.println("---".repeat(30));
            if(age > 30 && height > 160){
                System.out.println("The Male candidate is recruited");
            }else{
                System.out.println("The Male candidate is not recruited");
            }
            System.out.println("---".repeat(30));
        }else if(gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("F")){
            System.out.printf("Candidate Gender -  %20s%n", "Female");
            System.out.printf("Candidate Age -     %20d%n", age);
            System.out.printf("Candidate Height -  %20d%n", height);
            System.out.println("---".repeat(30));
            if(age > 25 && height > 155){
                System.out.println("The Female candidate is recruited");
            }else{
                System.out.println("The Female candidate is not recruited");
            }
            System.out.println("---".repeat(30));
        }else{
            System.out.println("---".repeat(30));
            System.out.println("Invalid Gender, please try again !");
            System.out.println("---".repeat(30));
        }
    }

}
