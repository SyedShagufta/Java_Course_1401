package com.learning.ClassesAndObjects_02;

public class CommandLineArgumentsDemo {

    public static void main(String[] args) {

        for(int i=0;i<args.length;i++){
            System.out.println("arguments "+i+": "+args[i]);
        }

    }

}
