package com.northsunstrider.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
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
                return "执行完毕";
            }
        });

        new Thread(task1, "t1").start();
        try {
            //使用Callable接口，能获取线程执行后的返回值。
            System.out.println(task1.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

}
