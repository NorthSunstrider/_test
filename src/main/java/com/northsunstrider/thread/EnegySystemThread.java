package com.northsunstrider.thread;

public class EnegySystemThread implements Runnable {

	private EnegySystem enegySystem;
	private int fromBox;
	private int maxAmount;
	private int DELAY = 10;

	public EnegySystemThread(EnegySystem enegySystem, int fromBox, int maxAmount) {
		super();
		this.enegySystem = enegySystem;
		this.fromBox = fromBox;
		this.maxAmount = maxAmount;
	}

	@Override
	public void run() {
		while (true) {
			//System.out.println(enegySystem);
			int toBox = (int) (enegySystem.getSize() * Math.random());
			int amount = (int) (maxAmount * Math.random());
			enegySystem.transfer(fromBox, toBox, amount);
			try {
				Thread.sleep((long) (DELAY * Math.random()));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
