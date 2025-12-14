package com.learning.inheritance;

class A{
    int age = 20;
}

class B extends A{
    int age = 30;
    void data(int age){
        // prints the argument age value
        System.out.println("Age = "+age);
        // prints the variable age from B class
        System.out.println("Age = "+this.age);
        // prints the parent class A's variable age
        System.out.println("Age = "+super.age);
    }

}

public class SuperKeywordDemo {

    public static void main(String[] args) {
        B b = new B();
        b.data(10);

    }

}
