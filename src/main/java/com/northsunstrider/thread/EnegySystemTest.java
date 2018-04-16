package com.northsunstrider.thread;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;

public class EnegySystemTest {

	public static void main(String[] args) {
		EnegySystem enegySystem = new EnegySystem(100, 1000);
		for (int i = 0; i < 100; i++) {
			EnegySystemThread enegySystemThread = new EnegySystemThread(enegySystem, i, 1000);
			Thread t = new Thread(enegySystemThread, "TransferThread_" + i);
			t.start();
		}
		a();
	}

	public static void exchange(EnegySystem enegySystem) {
		Random random = new Random();
		int from = random.nextInt(100);
		int to = random.nextInt(100);
		int exchangeNumber = random.nextInt(10);
		enegySystem.getValues()[from] -= exchangeNumber * 100;
		enegySystem.getValues()[to] += exchangeNumber * 100;
	}

	class exchangeThread implements Runnable {
		@Override
		public void run() {
			Random random = new Random();
			int from = random.nextInt(100);
			int to = random.nextInt(100);
			int exchangeNumber = random.nextInt(10);
			// enegySystem.getValues()[from] -= exchangeNumber * 100;
			// enegySystem.getValues()[to] += exchangeNumber * 100;
		}

	}

	public static synchronized void a() {
		short s1 = 1;
		short a=2;
		int b=3;
		
	}

}
