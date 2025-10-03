package com.learning.assignments.assignment4;

public class EvenNumbersBetween1to20 {

    public static void main(String[] args) {
        System.out.println("Even numbers between 1 to 20 program");
        System.out.println("===".repeat(30));

        for(int i=1; i<=20; i++){
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }

    }

}
