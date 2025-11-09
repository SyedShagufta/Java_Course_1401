package com.learning.multiThreading;

class CookingTask extends Thread{


    String task;
    CookingTask(String task)
    {
        this.task = task;
    }



    public void run()
    {
        System.out.println(task+" is being prepared by : "+Thread.currentThread().getName());
    }

}

public class Restaurant {

    public static void main(String[] args) {

        CookingTask t1 = new CookingTask("Salad");
        CookingTask t2 = new CookingTask("veg");
        CookingTask t3 = new CookingTask("non-veg");

        t1.start();
        t2.start();
        t3.start();

    }
}
