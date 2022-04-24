package com.company.therads;

public class Consumer implements Runnable {

    public Thread thread;
    private DB db;

    public Consumer(DB db) {
        thread = new Thread(this);
        this.db = db;
    }

    @Override
    public void run() {
        while (true)
            db.processData();

    }
}
