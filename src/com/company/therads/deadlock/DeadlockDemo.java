package com.company.therads.deadlock;

public class DeadlockDemo {

    public static Object monitor1 = new Object();
    public static Object monitor2 = new Object();

    /**
     * Deadlocka dushmemek ucun
     * 1. Her thread oz monitorunu oz daxilinde yaradib, istifade etmelidir.
     * 2. Inner synchronized blocklar istifade edilmemelidir
     * 3. Synchronized blockda olduqca kenar cod chagirilimamalidir
     */


    public static void main(String[] args) {

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.start();

        thread2.start();

    }

}
