package com.northsunstrider.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author North
 * @date 2022/07/09
 */
public class TestThread3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FutureTask<String> task1 = new FutureTask<>(new Callable<String>() {

            /* (non-Javadoc)
             * @see java.util.concurrent.Callable#call()
             */
            @Override
            public String call() throws Exception {
                System.out.println((Thread.currentThread().getName() + "已创建"));
                Thread.sleep(1000);
                return null;
            }
        });

        new Thread(task1, "t1").start();
    }

}
