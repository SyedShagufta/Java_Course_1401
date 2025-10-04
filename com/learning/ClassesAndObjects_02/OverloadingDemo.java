package com.learning.ClassesAndObjects_02;

class Rectangle{

    Rectangle(){
        System.out.println("Default package");
    }

    int Area(int l, int b){
        return l*b;
    }

    double Area(double l, double b){
        return l*b;
    }

}

public class OverloadingDemo {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        int area = r1.Area(100, 120);
        System.out.println("Area of rectangle r1 is : "+area);
    }

}
