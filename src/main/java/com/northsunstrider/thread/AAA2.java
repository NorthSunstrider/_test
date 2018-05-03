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
