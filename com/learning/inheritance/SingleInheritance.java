package com.learning.inheritance;

class Add2{
    void add(int a, int b){
        System.out.println("sum = "+(a+b));
    }
}

class Substraction2  extends Add1 {
    void substract(int a, int b){
        System.out.println("substract = "+(a-b));
    }
}

public class SingleInheritance {

    public static void main(String[] args) {
        Substraction2 sub = new Substraction2();
        sub.substract(100, 50);
        sub.add(10, 10);
    }


}
