package com.northsunstrider.thread;

public class Actor extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "登台演出");
		int count = 0;
		boolean actFlag = true;
		while (actFlag) {
			System.out.println(getName() + "第 " + count + " 次演出");
			count++;
			if (count % 10 == 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			if (count == 100)
				actFlag = false;
		}
		System.out.println(Thread.currentThread().getName() + "离开舞台");
	}

	public static void main(String[] args) {

		Thread actor = new Actor();
		actor.setName("秦叔宝");
		actor.start();
	}

}
