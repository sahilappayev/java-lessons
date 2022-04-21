package com.company.therads;

import java.util.UUID;

public class Producer implements Runnable {

    public Thread thread;

    public Producer(String name) {
        thread = new Thread(this, name);
    }

    @Override
    public void run() {
        System.out.println(this.thread.getName() + " called run method...");
        while (DB.getSize() < 50) {
            UUID uuid = UUID.randomUUID();
            System.out.println(this.thread.getName() + " add data : " + uuid);
            DB.addData(uuid);
        }
    }
}
