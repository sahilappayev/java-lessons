package com.company.therads;

public class Main {

    public static void main(String[] args) {

        // Thread Scheduler
        MyThread thread1 = new MyThread("one");
        MyThread thread2 = new MyThread("two");
        MyThread thread3 = new MyThread("three");
        MyThread thread4 = new MyThread("four");

        thread1.thread.start();
        thread2.thread.start();
        thread3.thread.start();
        thread4.thread.start();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Demo.a);
    }

}
