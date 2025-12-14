package com.learning.inheritance;

class Add3{
    void add(int a, int b){
        System.out.println("sum = "+(a+b));
    }
}

class Division3 extends Add3{
    void division(int a, int b){
        System.out.println("Division = "+(a/b));
    }
}


class Substraction3  extends Division3{
    void substract(int a, int b){
        System.out.println("substract = "+(a-b));
    }
}

class Multiplication3 extends Division3{
    void multiplication(int a, int b){
        System.out.println("Multiplication = "+(a*b));
    }
}



public class HybridInheritance {

    public static void main(String[] args) {

        Substraction3 sub = new Substraction3();
        sub.substract(100, 90);
        sub.division(10, 2);
        sub.add(10, 90);

        Multiplication3 mul = new Multiplication3();
        mul.multiplication(10, 10);
        mul.add(10, 10);
        mul.division(90, 10);

    }

}
