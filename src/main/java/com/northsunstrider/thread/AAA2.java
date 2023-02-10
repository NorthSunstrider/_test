package com.northsunstrider.thread;

/**
 * @Description: 测试线程同步
 * @author: North
 * @date: 2018年4月21日 下午1:26:46
 */
public class AAA2 {
    static Object object = new Object();

    /**
     * @Description TODO
     * @param args
     */
    public static void main(String[] args) {
        testWait();
    }

    // 该方法同步会失败，线程会在唤醒线程中卡死，锁一直被notify持有
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

        /*  notify()或者notifyAll()调用时并不会真正释放对象锁, 必须等到synchronized方法或者语法块执行完才真正释放锁.
        如上, 虽然调用了notifyAll, 但是紧接着进入了一个死循环。
        这会导致一直不能出临界区, 一直不能释放对象锁。
        所以，即使它把所有在等待池中的线程都唤醒放到了对象的锁池中，
        但是锁池中的所有线程都不会运行，因为他们始终拿不到锁。*/
        class NotifyThread extends Thread {
            @Override
            public void run() {
                synchronized (object) {
                    while (true) {
                        System.out.println("notify" + Thread.currentThread().getName());
                        try {
                            sleep(3000);
                            object.notifyAll();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
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
