package com.learning.multiThreading;

class Sync

{
    int amount=10000;
    synchronized void withdraw(int amount) //15000
    {
        System.out.println("going to withdraw");
        if(this.amount<amount)
        {
            System.out.println("you have insufficient balance please deposit some money");
            try {
                wait();
            }catch(Exception e)
            {
                System.out.println("waiting for deposit");
            }
        }
        this.amount=this.amount-amount;
        System.out.println("withdrawal completed");
    }

    synchronized void deposit(int amount)//10000
    {
        System.out.println("going to deposit");
        this.amount=this.amount+amount;
        System.out.println("deposit completed");
        notify();
    }

}

public class InterCommunication {

    public static void main(String[] args) {
        Sync i=new Sync();
        new Thread()
        {
            public void run()
            {
                i.withdraw(15000);
            }
        }.start();


        new Thread()
        {
            public void run()
            {
                i.deposit(10000);
            }
        }.start();


    }

}
