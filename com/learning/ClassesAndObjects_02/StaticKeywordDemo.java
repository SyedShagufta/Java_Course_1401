package com.learning.ClassesAndObjects_02;

class Student{
    String name;
    static String collegeName="3RI";
    int a;

    Student(String name){
        this.name=name;
    }

    void show(){
        System.out.println("Name = "+name+" College = "+collegeName+" a= "+a);
    }
}

public class StaticKeywordDemo {

    public static void main(String[] args) {
        Student s = new Student("Shagufta");
//        s.collegeName = "hello";
        s.show();
    }

}
