package com.learning.Inheritance;

class A1{
    private String name;

    A1(String name){
        this.name=name;
    }
    private void show(){
        System.out.println(name);
    }

    public void display(){
        System.out.println("inside display method");
        show();
    }

}

public class EncapsulationPrivateAccessDemo {
    public static void main(String[] args) {
        A1 a = new A1("Shagufta");
        a.display();
    }
}
