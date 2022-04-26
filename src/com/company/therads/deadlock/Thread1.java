package com.company.therads.deadlock;

import static com.company.therads.deadlock.DeadlockDemo.monitor1;
import static com.company.therads.deadlock.DeadlockDemo.monitor2;

public class Thread1 extends Thread {


    @Override
    public void run() {
        System.out.println("Thread 1 run method started...");

        // monitor 2 doludu

        synchronized (monitor2){

            System.out.println("Thread 1 Inside first synchronized block");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (monitor1){

                System.out.println("Thread 1 Inside second synchronized block");

            }
        }

        System.out.println("Thread 1 run method completed...");
    }
}
