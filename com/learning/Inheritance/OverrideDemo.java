package com.learning.Inheritance;

class Car{

    int wheels;
    String color;
    int seats;

    public Car(int wheels, String color, int seats) {
        this.wheels = wheels;
        this.color = color;
        this.seats = seats;
    }

    public void drive(){
        System.out.println("Driving the car");
    }

}

class Benz extends Car{

    String owner;
    double price;

    Benz(String owner, double price){
        super(4, "Magenta", 2);
        this.owner = owner;
        this.price = price;
    }

    @Override
    public void drive() {
        System.out.println(owner+" is driving the car");
    }
}

public class OverrideDemo {

    public static void main(String[] args) {

        Benz benz = new Benz("Shagufta", 4500000);
        benz.drive();

    }

}
