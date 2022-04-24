package com.company.therads;

public class MyThread implements Runnable {

    public final Thread thread;
    private Demo demo;

    public MyThread(String name, Demo demo) {
        this.thread = new Thread(this, name);
        this.demo = demo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            demo.incA();
        }
    }
}
