package com.learning.ClassesAndObjects_02;

class XYZ{

    int a=11;
    int b=22;
    int c=2;

    XYZ(int a, int b){
        System.out.println("Parameterized constructor - "+a+" "+b+" "+c);
        this.a=a;
        this.b=b;
    }
}

public class ConstructorDemo {

    public static void main(String[] args) {
        XYZ xyz = new XYZ(10,12);
    }

}
