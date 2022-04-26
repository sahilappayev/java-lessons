package com.company.therads;

public class Demo {

    // shared resource
    public volatile int a;

    public void incA() {
        // thread safe
        // 1 Threadlik qutu - monitor
        // lock - 10 Threads
        synchronized (this) {
            a++;
        }
    }

    public int getA() {
        return a;
    }
}
