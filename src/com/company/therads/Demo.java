package com.company.therads;

public class Demo {
    public int a;

    public void incA() {
        // 1 Threadlik qutu - monitor
        // lock
        synchronized (this) {
            a++;
        }
    }

    public int getA() {
        return a;
    }
}
