package com.learning.lambdaExpressions;

interface Mul{
    int show(int a);
}

public class UnaryOperator {

    public static void main(String[] args) {
        Mul a1 = (int x) -> (x*10);
        int res = a1.show(2);
        System.out.println("Multiplication : "+res);

    }
}
