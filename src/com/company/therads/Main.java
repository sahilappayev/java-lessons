package com.company.therads;

public class Main {

    public static void main(String[] args) {
//        DB db = new DB();
//        Producer producer = new Producer(db);
//        Consumer consumer = new Consumer(db);
//        producer.thread.start();
//        consumer.thread.start();

        Demo demo = new Demo();

        MyThread myThread1 = new MyThread("ONE", demo);
        MyThread myThread2 = new MyThread("TWO", demo);
        MyThread myThread3 = new MyThread("THREE", demo);
        MyThread myThread4 = new MyThread("FOUR", demo);

        myThread1.thread.start();
        myThread2.thread.start();
        myThread3.thread.start();
        myThread4.thread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(demo.getA());


    }

}
