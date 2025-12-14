package com.learning.innerNestedClass;

// A class that has no name is called anonymous inner class
// It can be instantiated only once
// it is usually declared inside a method or code block
// It is accessible only at the point where it is defined

abstract class AnonymousDemo{
    public void display()
    {
        System.out.println("Hello");
    }

     public abstract void eat();
}

public class NonStaticNestedAnonymousInnerClass {

    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo(){
            public void eat(){
                System.out.println("This is an anonymous class example");
            }
        };

        an.display();
        an.eat();




    }

}
