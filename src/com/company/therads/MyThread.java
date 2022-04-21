package com.company.therads;

public class MyThread implements Runnable {

    public final Thread thread;

    public MyThread(String name) {
        this.thread = new Thread(this, name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Demo.incA();
        }
    }
}
