package com.northsunstrider.designpattern.producerconsumer.version2;

import java.util.List;


public class Consumer implements Runnable {
    private List<PCData> queue;

    public Consumer(List<PCData> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (Thread.currentThread().isInterrupted())
                    break;
                PCData data = null;
                synchronized (queue) {
                    if (queue.size() == 0) {
                        queue.wait();
                        queue.notifyAll();
                    }
                    data = queue.remove(0);
                }
                System.out.println(
                        Thread.currentThread().getId() + " 消费了:" + data.get() + " result:" + (data.get() * data.get()));
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}