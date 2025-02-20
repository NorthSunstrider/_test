package com.northsunstrider.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
在方法中运用线程，并发执行多个费时操作，并待线程执行完毕后，将结果返回给主线程，主线程再继续执行
 */
public class MainThreadWaitNodeThread {

    public static void main(String[] args) {

    }

    public static void byJoin() {
        Thread t1 = new Thread(() -> {
            System.out.println("开始查询用户信息");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("用户信息查询结束，返回结果给主线程");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("开始查询所有商品信息");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("商品信息查询结束，返回结果给主线程");
        });

        Thread t3 = new Thread(() -> {
            System.out.println("开始查询用户消费偏好");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("用户消费偏好查询结束，返回结果给主线程");
        });

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("汇总所有查询结果，统一返回给前端");
    }

    public static void byAwait() {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // 提交3个任务
        executor.submit(() -> {
            System.out.println("Task 1 is running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 1 is done");
        });

        executor.submit(() -> {
            System.out.println("Task 2 is running");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 2 is done");
        });

        executor.submit(() -> {
            System.out.println("Task 3 is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 3 is done");
        });

        // 停止接收新的任务，并等待已提交任务执行完毕
        executor.shutdown();

        try {
            // 等待所有任务完成，最多等待10分钟
            if (!executor.awaitTermination(0, TimeUnit.MINUTES)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        // 主线程继续执行
        System.out.println("All tasks have finished. Main thread continues.");
    }

    public static void byLatch() {
        int numberOfThreads = 3;
        CountDownLatch latch = new CountDownLatch(numberOfThreads);

        // 创建并启动3个线程
        new Thread(() -> {
            System.out.println("Thread 1 is running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 is done");
            latch.countDown(); // 线程结束时，计数器减1
        }).start();

        new Thread(() -> {
            System.out.println("Thread 2 is running");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 is done");
            latch.countDown(); // 线程结束时，计数器减1
        }).start();

        new Thread(() -> {
            System.out.println("Thread 3 is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 3 is done");
            latch.countDown(); // 线程结束时，计数器减1
        }).start();

        try {
            // 主线程等待，直到计数器变为0
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 主线程继续执行
        System.out.println("All threads have finished. Main thread continues.");

    }
}
