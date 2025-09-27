package com.learning.basics_01;

import java.util.Random;
import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Logical Operators - && , || , ! %n");

        System.out.print("Guess the number (0 to 100) : ");
        int num = sc.nextInt();

        Random random = new Random();
        int randomNum = random.nextInt(0, 100);
        System.out.printf("%n Ssshh !! The random num is %d", randomNum);

        if(num != randomNum){

        }else{
            System.out.printf("%n Hurray ! You have guessed it right!!");
        }

    }

}
