package com.northsunstrider.concurrent;

public class Test {

	public static void main(String[] args) {
		// concurrentOperateUser();
		concurrentOperation();
	}

	/*
	 * 模拟并发操作用户余额
	 * 并不会产生并发问题，因为在线程中传入的是同一个user对象，而java的对象传递是引用传递
	 * 所有在线程A和线程B中实际操作的都是在主方法中创建的user对象
	 * 而java本身保证了同一个对象的线程安全
	 * 所有不会产生问题	
	 */
	public static void concurrentOperateUser() {
		try {
			User user = new User(0, "Sam", 2000);
			RunnerA runnerA = new RunnerA(user);
			Thread t1 = new Thread(runnerA);
			t1.start();
			RunnerB runnerB = new RunnerB(user);
			Thread t2 = new Thread(runnerB);
			t2.start();
			// 让主线程阻塞2s，方便取得最终的用户余额
			Thread.currentThread().sleep(2000);
			System.out.println("========" + user.getBalance());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * 模拟并发操作
	 */
	public static void concurrentOperation() {
		try {
			User user = new User(0, "Sam", 2000);

			Thread t1 = new Thread(new Runnable() {
				@Override
				public void run() {
					for (int i = 0; i < 20; i++) {
						int temp = user.getBalance();
						// 模拟业务中可能产生的执行时间
						try {
							Thread.currentThread().sleep(50);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						user.setBalance(temp + 200);
					}
				}
			});
			t1.start();

			Thread t2 = new Thread(new Runnable() {
				@Override
				public void run() {
					for (int i = 0; i < 20; i++) {
						int temp = user.getBalance();
						// 模拟业务中可能产生的执行时间
						try {
							Thread.currentThread().sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						user.setBalance(temp + 200);
					}
				}
			});
			t2.start();

			// 让主线程阻塞2s，方便取得最终的用户余额
			Thread.currentThread().sleep(2000);
			System.out.println("========" + user.getBalance());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class RunnerA implements Runnable {
	User user;

	public RunnerA(User user) {
		super();
		this.user = user;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.print(user + "  A  " + i + "  before=" + user.getBalance() + "  after:");
			user.setBalance(user.getBalance() + 200);
			System.out.println(user.getBalance());
		}
	}

}

class RunnerB implements Runnable {
	User user;

	public RunnerB(User user) {
		super();
		this.user = user;
	}

	@Override
	public void run() {
		for (int j = 0; j < 20; j++) {
			System.out.print(user + "  B  " + j + "  before=" + user.getBalance() + "  after:");
			user.setBalance(user.getBalance() + 200);
			System.out.println(user.getBalance());
		}
	}

}