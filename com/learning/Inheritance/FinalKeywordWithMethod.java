package com.learning.Inheritance;

class Measurements{

    final double getPiValue(){
        return 3.147;
    }

    void AreaOfCircle(int radius){
        System.out.println("Area = "+(getPiValue()*radius*radius));
    }

}

public class FinalKeywordWithMethod {
    public static void main(String[] args) {
        Measurements m = new Measurements();
        m.AreaOfCircle(10);
    }
}
