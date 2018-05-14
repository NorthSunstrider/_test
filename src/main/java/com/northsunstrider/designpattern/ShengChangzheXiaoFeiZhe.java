package com.northsunstrider.designpattern;

import java.util.Vector;

/**
 * @Description: 生产者消费者模型 <br/>
 *               在移除vector元素时依然会报错 ,原因是在判断完数据size后，别的线程已经进行了移除操作，就会数组越界<br/>
 *               添加元素时也会超过10个限制
 * @author: North
 * @date: 2018年4月23日 下午12:50:43
 */
public class ShengChangzheXiaoFeiZhe {

	Vector<String> vector = new Vector<String>();

	/**
	 * @Description TODO
	 * @param args
	 */
	public static void main(String[] args) {
		ShengChangzheXiaoFeiZhe a = new ShengChangzheXiaoFeiZhe();
		for (int i = 0; i < 3; i++) {
			Thread thread = a.new Producer();
			thread.start();
		}

		for (int i = 0; i < 5; i++) {
			Thread thread = a.new XiaoFeiZhe();
			thread.start();
		}

	}

	class Producer extends Thread {
		@Override
		public void run() {
			try {
				while (true) {
					// sleep((long) (Math.random() * 10000));
					if (vector.size() < 10) {
						vector.addElement(
								"一个汉堡来自" + Thread.currentThread().getName() + "time" + System.currentTimeMillis());
						System.out.println(Thread.currentThread().getName() + "制造了一个汉堡，当前总量：" + vector.size());
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	class XiaoFeiZhe extends Thread {
		@Override
		public void run() {
			try {
				while (true) {
					sleep((long) (Math.random() * 10000));
					// 数组越界在这里产生
					if (vector.size() > 0) {
						vector.remove(0);
						System.out.println(Thread.currentThread().getName() + "消费了一个汉堡，当前总量：" + vector.size());
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
