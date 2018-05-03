package com.northsunstrider.designpattern;

import java.util.Vector;

/**
 * @Description: 生产者消费者模型的改进版本
 * @author: North
 * @date: 2018年4月23日 下午12:50:43
 */
public class ShengChangzheXiaoFeiZhe2 {

	// 加上static变量，能实现线程安全
	// 程序在对vector进行增删的时候还是正常的，只是有时候会出现脏读
	static Vector<String> vector = new Vector<String>();

	/**
	 * @Description TODO
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			Thread thread = new ShengChangzheXiaoFeiZhe2().new Producer();
			thread.start();
		}

		// 让主线程等待，方便观察第一次生产过程
		try {
			Thread.currentThread().sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (String str : vector)
			System.out.println(str);

		for (int i = 0; i < 5; i++) {
			Thread thread = new ShengChangzheXiaoFeiZhe2().new XiaoFeiZhe();
			thread.start();
		}

	}

	class Producer extends Thread {
		@Override
		public void run() {
			try {
				while (true) {
					sleep(1000);
					if (vector.size() < 10) {
						vector.addElement(
								"一个汉堡来自" + Thread.currentThread().getName() + "time" + System.currentTimeMillis());
						System.out.println(Thread.currentThread().getName() + "制造了一个汉堡，当前总量：" + vector.size());
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	class XiaoFeiZhe extends Thread {
		@Override
		public void run() {
			try {
				while (true) {
					sleep((long) (Math.random() * 500));
					if (vector.size() > 0) {
						vector.remove(0);
						System.out.println(Thread.currentThread().getName() + "消费了一个汉堡，当前总量：" + vector.size());
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
