package com.learning.inheritance;



class Add1{
    void add(int a, int b){
        System.out.println("sum = "+(a+b));
    }
}

class Substraction1  extends Add1{
    void substract(int a, int b){
        System.out.println("substract = "+(a-b));
    }
}

class Multiplication1 extends Add1{
    void multiplication(int a, int b){
        System.out.println("Multiplication = "+(a*b));
    }
}


public class Hierarchial {

    public static void main(String[] args) {

        Multiplication1 mul = new Multiplication1();
        mul.multiplication(10, 8);
        mul.add(10, 5);
        Substraction1 sub = new Substraction1();
        sub.substract(100, 10);
        sub.add(100, 10);

    }

}
