package com.learning.innerNestedClass;

class OuterClass{

    static int employeeId;
    private String employeeName;
    private double salary;

    OuterClass(){
        System.out.println("Creating an object of outer class");
    }

    OuterClass(String employeeName, double salary){
        this.employeeName = employeeName;
        this.salary = salary;
    }

    private void printDetails(){
        System.out.println(employeeName);
        System.out.println(salary);
    }

    // we cannot access the methods of inner class like this
//    InnerClass.data()



    static class InnerClass{

        void data(){
            System.out.println("This is inner class of the employee id "+OuterClass.employeeId);
            // We cannot access the private or any other fields other than static for a static Nested class
//            System.out.println(OuterClass.employeeName);
        }

    }
}


public class StaticNestedClassDemo {

    public static void main(String[] args) {

        OuterClass.InnerClass oi = new OuterClass.InnerClass();
        oi.data();

    }

}
