package com.learning.inheritance;

class Add{
    void add(int a, int b){
        System.out.println("sum = "+(a+b));
    }
}

class Substraction  extends Add{
    void substract(int a, int b){
        System.out.println("substract = "+(a-b));
    }
}

class Multiplication extends Substraction{
    void multiplication(int a, int b){
        System.out.println("Multiplication = "+(a*b));
    }
}

public class MultiLevel {

    public static void main(String[] args) {
       Multiplication mul = new Multiplication();
       mul.multiplication(10, 9);
       mul.substract(100, 10);
       mul.add(10, 10);
    }

}


