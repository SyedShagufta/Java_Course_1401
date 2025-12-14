package com.learning.innerNestedClass;

// A class created inside a method is known as local inner class
// And this local inner class must be instantiated inside the Outer method itself
class OuterLocalClass{

    private int x = 5;

    void display(){

        class Local{
            void msg(){
                System.out.println("Displaying the variable of Outer Local Class x = "+x);
            }
        }

        Local l = new Local();
        l.msg();
    }

}


public class NonStaticNestedLocalInnerClassDemo {

    public static void main(String[] args) {

        OuterLocalClass ol = new OuterLocalClass();
        ol.display();

    }

}
