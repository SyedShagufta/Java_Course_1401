package com.learning.finalAssignments.conditionalStatements_02;

import java.util.Scanner;

public class VowelOrNot_04 {

    public static void main(String[] args) {
        System.out.println("Checking the Character is Vowel or not");
        System.out.println("===".repeat(30));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character you want to check");
        char c = sc.next().charAt(0);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ){
            System.out.println(c+" is vowel");
        }else{
            System.out.println(c+" is not a vowel");
        }
    }

}
