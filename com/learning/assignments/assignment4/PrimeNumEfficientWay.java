package com.learning.assignments.assignment4;

import java.util.Scanner;

public class PrimeNumEfficientWay {

//    Prime Number Definition
//
//    A prime number is a number greater than 1 that has exactly two divisors:
//            1 and itself.
//    Example:
//
//            7 → divisors are {1, 7} → prime.
//
//12 → divisors are {1, 2, 3, 4, 6, 12} → not prime.
//
//            🔹 Usual way (your code)
//
//    You checked every number from 1 to num.
//    That works, but for a big number like 1,000,003, it means doing a million checks.
//
//            🔹 Smarter way
//
//    If num is divisible by a number greater than √num, then the other divisor must be less than √num.
//    So you only need to check until √num.
//
//            Example 1:
//
//    Take num = 36.
//
//√36 = 6.
//
//    Divisors: (2,18), (3,12), (4,9), (6,6).
//            👉 Notice: once you pass 6, you are just repeating pairs.
//
//            Example: 12 is a divisor, but its pair is 3, which is already below 6.
//
//    Example 2:
//
//    Take num = 37.
//
//√37 ≈ 6.08.
//
//    If no number from 2 → 6 divides 37, then no number greater than 6 can divide it either (other than 37 itself).
//            👉 So 37 is prime.

    public static void main(String[] args) {

        boolean isPrime = true;

        System.out.println("Enter a number to check : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n <= 1){
            isPrime = false;
        }else{
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println("It is prime number");
        }else{
            System.out.println("Not a prime number");
        }

    }

}
