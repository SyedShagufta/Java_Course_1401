package com.learning.finalAssignments.VariablesAndDataTypes_01;

public class SwapTwoNumbersWithoutThirdVariable_08 {

    public static void main(String[] args) {
        // Using Arithmetic operators
        int a = 10;
        int b = 5;

        System.out.println("Before Swapping - a="+ a +" b="+ b);

        a = a+b; // 15
        b = a-b; // 10
        a = a-b; // 5

        System.out.println("After Swapping -  a="+ a +" b="+ b);

        // Using Xor operatio
        int x=100;
        int y=50;

        System.out.println("---".repeat(30));

        System.out.println("Before Swapping - x="+ x +" y="+ y);

        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println("After Swapping -  x="+ x +" y="+ y);
    }

}
