package com.learning.inheritance;

class Fruit{
    public void eat(){
        System.out.println("A fruit is eatable");

    }
}

class PineApple extends Fruit{

    @Override
    public void eat(){
        super.eat();
        System.out.println("This is pineapple fruit");
        System.out.println("---".repeat(30));
    }

}

class Strawberry extends Fruit{
    @Override
    public void eat(){
        super.eat();
        System.out.println("This is strawberry fruit");
        System.out.println("---".repeat(30));
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {

        PineApple pineApple = new PineApple();
        Strawberry strawberry = new Strawberry();

        // Let's take the reference
        Fruit fruit;

        fruit = pineApple;
        fruit.eat();

        fruit = strawberry;
        fruit.eat();



    }

}
