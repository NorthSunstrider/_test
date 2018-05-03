package com.northsunstrider.designpattern;

import java.util.Vector;

/**
 * @Description: 生产者消费者模型
 * @author: North
 * @date: 2018年4月23日 下午12:50:43
 */
public class ShengChangzheXiaoFeiZhe {

	// 以下所有线程使用的都不是同一个vector
	Vector<String> vector = new Vector<String>();

	/**
	 * @Description TODO
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			Thread thread = new ShengChangzheXiaoFeiZhe().new Producer();
			thread.start();
		}

		for (int i = 0; i < 5; i++) {
			Thread thread = new ShengChangzheXiaoFeiZhe().new XiaoFeiZhe();
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
			System.out.println(Thread.currentThread().getName());
			try {
				while (true) {
					sleep((long) (Math.random() * 500));
					System.out.println(vector.size());
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
