package com.northsunstrider.thread;

public class WaitNotifyTest {

    // 在多线程间共享的对象上使用wait
    private String[] shareObj = {"true"};

    public static void main(String[] args) {
        WaitNotifyTest test = new WaitNotifyTest();
        ThreadWait threadWait1 = test.new ThreadWait("wait thread1");
        // 线程执行优先级，范围1-10，只是理论优先级，不是绝对，在cpu调度过程中可能出现低优先级线程先执行的情况
        threadWait1.setPriority(2);
        ThreadWait threadWait2 = test.new ThreadWait("wait thread2");
        threadWait2.setPriority(3);
        ThreadWait threadWait3 = test.new ThreadWait("wait thread3");
        threadWait3.setPriority(4);

        ThreadNotify threadNotify = test.new ThreadNotify("notify thread");

        threadNotify.start();
        threadWait1.start();
        threadWait2.start();
        threadWait3.start();
    }

    class ThreadWait extends Thread {

        public ThreadWait(String name) {
            super(name);
        }

        public void run() {
            synchronized (shareObj) {
                while ("true".equals(shareObj[0])) {
                    System.out.println("线程" + this.getName() + "开始等待");
                    long startTime = System.currentTimeMillis();
                    try {
                        shareObj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    long endTime = System.currentTimeMillis();
                    System.out.println("线程" + this.getName() + "等待时间为：" + (endTime - startTime));
                }
            }
            System.out.println("线程" + getName() + "等待结束");
        }
    }

    class ThreadNotify extends Thread {

        public ThreadNotify(String name) {
            super(name);
        }

        public void run() {
            while (true) {
                try {
                    // 给等待线程等待时间
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (shareObj) {
                    System.out.println("线程" + this.getName() + "开始准备通知");
                    // shareObj[0] = "false";
                    shareObj.notifyAll();
                    System.out.println("线程" + this.getName() + "通知结束");
                }
                System.out.println("线程" + this.getName() + "运行结束");
            }
        }
    }
}