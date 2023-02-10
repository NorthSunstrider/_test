package com.northsunstrider.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年8月29日 下午10:19:36
 */
public class TimerTest {

    /**
     * @Description TODO
     * @param args
     */
    public static void main(String[] args) {
        // timer1();
        //
        // System.out.println("===========");
        //
        // timer2();
        // System.out.println("===========");
        //
        timer3();
        // timer4();
    }

    public static void timer1() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                System.out.println(" timer1--timerTask");
            }
        }, 5000);
    }

    public static void timer2() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                System.out.println(" timer2--timerTask");
            }
        }, new Date(System.currentTimeMillis() + 1000));

    }

    public static void timer3() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                System.out.println(" timer3--timerTask");
            }
        }, new Date(System.currentTimeMillis()), 2000);

    }

    public static void timer4() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                System.out.println(" timer4--timerTask");
            }
        }, 10000, 1000);

    }
}
