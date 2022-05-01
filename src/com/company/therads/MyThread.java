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
        System.out.println(thread.getName() + " run method started...");
        for (int i = 0; i < 100; i++) {
            demo.incA();
        }
        System.out.println(thread.getName() + " run method completed...");
    }
}
