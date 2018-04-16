package com.northsunstrider.thread;

public class TestThread2 {

	public static int a = 200;

	public static void main(String args[]) {

		Runner runner = new Runner();
		runner.start();
		for (int i = 0; i < 100; i++) {
			a = i;
			System.out.println("Thread Main is running : " + i + " ===== value a:" + a);
			// if (i == 5)
			// return;
		}
	}

	private static class Runner extends Thread {

		public Runner() {
			super();
		}

		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				a = i;
				System.out.println("Thread Runner is running : " + i + " ===== value a:" + a);
			}
		}

	}
}
