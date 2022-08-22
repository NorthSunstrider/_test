package com.northsunstrider.thread;

/**
 * @Description: 测试线程同步
 * @Description: 比对AAA2类，观察object的锁是什么时候释放的
 * @author: North
 * @date: 2018年4月21日 下午1:26:46
 */
public class AAA {
    static Object object = new Object();

    public static void main(String[] args) {
        testWait();
    }

    // 该方法成功，锁会释放，然后被等待线程竞争
    public static void testWait() {

        class WaitThread extends Thread {
            @Override
            public void run() {
                synchronized (object) {
                    while (true) {
                        System.out.println("wait" + Thread.currentThread().getName());
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

        class NotifyThread extends Thread {
            @Override
            public void run() {
                while (true) {
                    System.out.println("notify" + Thread.currentThread().getName());
                    try {
                        sleep(3000);
                        synchronized (object) {
                            object.notifyAll();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            Thread t = new WaitThread();
            t.start();
        }

        Thread t = new NotifyThread();
        t.start();
    }

}
