package com.learning.multiThreading;

class PrintTable{


    public void showTable(int x) {
        synchronized (this){

            for(int i=1; i<=10;i++){
                System.out.printf("%d x %d = %d%n", x, i, x*i);
            }
            System.out.println("==".repeat(10));
            try{
                Thread.sleep(400);
            }catch (Exception e){
                System.out.println(e);
            }

        }
    }
}

class Thread1 extends Thread{
    PrintTable t1;
    Thread1(PrintTable t1){
        this.t1 = t1;
    }

    public void run(){
        t1.showTable(2);
    }
}

class Thread2 extends Thread{
    PrintTable t2;
    Thread2(PrintTable t2){
        this.t2 = t2;
    }

    public void run(){
        t2.showTable(3);
    }
}

public class SynchronizedDemo {

    public static void main(String[] args) {
        PrintTable pt = new PrintTable();
        Thread1 t1 = new Thread1(pt);
        Thread2 t2 = new Thread2(pt);
        t2.start();
        t1.start();
    }

}
