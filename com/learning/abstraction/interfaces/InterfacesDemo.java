package com.learning.abstraction.interfaces;

interface Example{
    void data();
}

class Example2 implements Example{

    @Override
    public void data() {
        System.out.println("overriding interface methods for implementing 100% abstraction");
    }
}

public class InterfacesDemo {

    public static void main(String[] args) {
        Example2 e = new Example2();
        e.data();
    }

}
