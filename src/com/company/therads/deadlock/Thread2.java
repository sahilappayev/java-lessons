package com.company.therads.deadlock;

public class Thread2 extends Thread{

//    private Object monitor1 = new Object();
//    private Object monitor2 = new Object();


    @Override
    public void run() {
        System.out.println("Thread 2 run method started...");

        // monitor 1 doludur

        synchronized (DeadlockDemo.monitor1){

            System.out.println("Thread 2 Inside first synchronized block");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (DeadlockDemo.monitor2){

                System.out.println("Thread 2 Inside second synchronized block");

            }

        }
        System.out.println("Thread 2 run method completed...");
    }
}
