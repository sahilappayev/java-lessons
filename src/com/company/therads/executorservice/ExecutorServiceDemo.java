package com.company.therads.executorservice;

import com.company.therads.Demo;
import com.company.therads.MyThread;

import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {

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
        Demo demo = new Demo();

        MyThread myThread1 = new MyThread("ONE", demo);
        MyThread myThread2 = new MyThread("TWO", demo);
        MyThread myThread3 = new MyThread("THREE", demo);
        MyThread myThread4 = new MyThread("FOUR", demo);
        MyThread myThread5 = new MyThread("FOUR", demo);



        ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 5,
                1, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        executor.allowCoreThreadTimeOut(true);

        Future<?> submit = executor.submit(myThread1);
        executor.submit(myThread2);
        executor.submit(myThread3);
        executor.submit(myThread4);
        executor.submit(myThread5);

        System.out.println("Thread count: " + Thread.activeCount());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread count: " + Thread.activeCount());

        executor.shutdown();
        try {
            if(executor.awaitTermination(1000, TimeUnit.MILLISECONDS)){
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        try {
            executor.submit(myThread4);
        }catch (Exception e){
            System.out.println("ExecutorService not working...");
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(demo.getA());

    }

}
