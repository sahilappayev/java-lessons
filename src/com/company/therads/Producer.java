package com.company.therads;

public class Producer implements Runnable {

    public Thread thread;
    private DB db;

    public Producer(DB db) {
        thread = new Thread(this);
        this.db = db;
    }


    @Override
    public void run() {
        while (db.list.size() < 10)
            db.addData("sss");

    }
}
