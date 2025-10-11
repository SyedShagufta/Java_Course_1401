package com.learning.Inheritance;

class Circle{

    final double pi = 3.14;
    int r;

    Circle(int radius){
        this.r=radius;
    }

    void area(){
        System.out.println("Area of circle = "+(pi*r*r));
    }

}

public class FinalKeywordWithVariable {

    public static void main(String[] args) {
        Circle c = new Circle(10);
        c.area();

    }

}
