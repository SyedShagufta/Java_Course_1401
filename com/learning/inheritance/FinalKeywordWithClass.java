package com.learning.inheritance;

class ABC {

}

final class Base{

    void display(){
        System.out.println("This is a base class and it cannot be extended by any other class ");
    }

}

public class FinalKeywordWithClass {
    public static void main(String[] args) {
        Base b = new Base();
        b.display();
    }
}
