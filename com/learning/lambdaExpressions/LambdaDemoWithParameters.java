package com.learning.lambdaExpressions;

interface LambdaDemo{
    void sum(int x, int y);
}

interface Substraction{
    int sub(int x, int y);
}

public class LambdaDemoWithParameters {

    public static void main(String[] args) {
        LambdaDemo ld = (int x, int y) -> {
            System.out.println("Sum = "+x+y);
        };
        ld.sum(12, 13);

        Substraction sub = (int x, int y) -> x-y;
        System.out.println("Sub = "+sub.sub(100, 50));

    }

}
