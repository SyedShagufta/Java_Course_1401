package com.learning.innerNestedClass;

class OuterParent{
    // This outer class doesn't have the access to the fields of the Inner class

    public String name;
    public String city;
    private String gender;
    private int age;

    public OuterParent(String name, String city, String gender, int age) {
        this.name = name;
        this.city = city;
        this.gender = gender;
        this.age = age;
    }

    public void printNecessaryDetails(){
        System.out.println("Name = "+name);
        System.out.println("City = "+city);
        System.out.println("Age = "+age);
        System.out.println("Gender = "+gender);
        InnerChild innerChild = new InnerChild();
        innerChild.detailsOfOuterClass();
    }




    // This inner nested class can access all the public, protected, private members of the Outer class
    class InnerChild {

        void detailsOfOuterClass(){
            System.out.printf("The age of %s is %d and he/she lives in %s%n", name, age, city);
        }

    }

}

public class NonStaticNestedClass {

    public static void main(String[] args) {

        // we cannot access inner child like this because its not a static class
//        OuterParent.InnerChild innerChild= new OuterParent.InnerChild();

        // Hence we need to create an object inside the Outer parent class

        OuterParent op = new OuterParent("sofia", "pune", "female", 22);
        op.printNecessaryDetails();

    }

}
