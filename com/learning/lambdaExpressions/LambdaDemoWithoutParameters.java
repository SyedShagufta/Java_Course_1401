package com.learning.lambdaExpressions;

interface Pqr{
    void show();

}

public class LambdaDemoWithoutParameters {
    public static void main(String[] args) {
        // using lambda expression for without parameter functions
        Pqr pqr = () -> {
            System.out.println("calling PQR show() using lambda expressions");
        };

        pqr.show();
    }

}
