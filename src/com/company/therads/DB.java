package com.company.therads;

import java.util.ArrayList;
import java.util.List;

public class DB {
    public volatile List<String> list = new ArrayList<>();
    public boolean isProcessed = true;

    public synchronized void addData(String s) {
        while (isProcessed) {
            System.out.println("addData: " + s);
            list.add(s);
            isProcessed = false;
            notify();
            try {
                System.out.println("Producer gozleyir....");
                wait();
                System.out.println("Producer ishine davam edir...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void processData() {
        while (!isProcessed) {
            if (!list.isEmpty()) {
                String remove = list.remove(list.size() > 1 ? list.size() - 1 : 0);
                System.out.println("processData: " + remove);
            }
            isProcessed = true;
            notify();
            try {
                System.out.println("Consumer gozleyir....");
                wait();
                System.out.println("Consumer ishine davam edir...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }

}
