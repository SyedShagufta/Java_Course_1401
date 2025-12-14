package com.learning.multiThreading;

public class DeadLockFree {

    public static void main(String[] args) {

        final Resource resource1 = new Resource("Resource1");

        final Resource resource2 = new Resource("Resource2");



// Thread 1 locks resource1 then resource2

        Thread t1 = new Thread(() -> {

            synchronized (resource1) {

                System.out.println("Thread 1: Locked " + resource1.name);



                try { Thread.sleep(100); } catch (InterruptedException e) {}



                synchronized (resource2) {

                    System.out.println("Thread 1: Locked " + resource2.name);

                }

            }

        });



// Thread 2 ALSO locks resource1 then resource2 (same order!)

        Thread t2 = new Thread(() -> {

            synchronized (resource1) {

                System.out.println("Thread 2: Locked " + resource1.name);



                try { Thread.sleep(100); } catch (InterruptedException e) {}



                synchronized (resource2) {

                    System.out.println("Thread 2: Locked " + resource2.name);

                }

            }

        });



        t1.start();

        t2.start();

    }

}
