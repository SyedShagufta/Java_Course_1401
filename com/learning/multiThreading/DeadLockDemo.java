package com.learning.multiThreading;

class Resource{

    String name;
    Resource(String name)
    {
        this.name = name;
    }

}

public class DeadLockDemo {

    public static void main(String[] args) {
        final Resource resource1 = new Resource("Resource1");
        final Resource resource2 = new Resource("Resource2");

        // Thread-1 tries to lock the resource then resource 2
        Thread t1 = new Thread(() -> {

            synchronized (resource1) {

                System.out.println("Thread 1: Locked " + resource1.name); //Resourse1
                try { Thread.sleep(100);
                }
                catch (InterruptedException e) {}
                synchronized (resource2) {

                    System.out.println("Thread 1: Locked " + resource2.name); //Resource2

                }

            }

        });

        // Thread-2 tries to lock resource2 then resource1
        Thread t2 = new Thread(() -> {

            synchronized (resource2) {

                System.out.println("Thread 2: Locked " + resource2.name); //Resoursce 2



                try { Thread.sleep(100); } catch (InterruptedException e) {}



                synchronized (resource1) {

                    System.out.println("Thread 2: Locked " + resource1.name); //Resource1

                }

            }

        });

        t1.start();
        t2.start();

    }
}
