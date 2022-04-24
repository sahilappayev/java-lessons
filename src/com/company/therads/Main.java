package com.company.therads;

public class Main {

    /**
     * 1. Single Thread Executor : A thread pool with only one thread.
     * So all the submitted tasks will be executed sequentially.
     * Method : Executors.newSingleThreadExecutor()
     *
     * 2. Cached Thread Pool : A thread pool that creates as many threads it needs to execute the task in parallel.
     * The old available threads will be reused for the new tasks. If a thread is not used during 60 seconds,
     * it will be terminated and removed from the pool.
     * Method : Executors.newCachedThreadPool()
     *
     * 3. Fixed Thread Pool : A thread pool with a fixed number of threads.
     * If a thread is not available for the task, the task is put in queue waiting for
     * another task to ends.
     * Method : Executors.newFixedThreadPool()
     *
     * 4. Scheduled Thread Pool : A thread pool made to schedule future task.
     * Method : Executors.newScheduledThreadPool()
     *
     * 5. Single Thread Scheduled Pool : A thread pool with only one thread to schedule future task.
     * Method : Executors.newSingleThreadScheduledExecutor()
     */

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