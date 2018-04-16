package com.northsunstrider.thread;

public class EnegySystem {
	private int values[];
	private final Object obj = new Object();

	public EnegySystem(int size, int amount) {
		values = new int[size];
		for (int i = 0; i < size; i++)
			values[i] = amount;
	}

	public void  transfer(int from, int to, int amount) {
		synchronized (obj) {
			if (values[from] < amount)
				return;
			System.out.print(Thread.currentThread().getName());
			values[from] -= amount;
			System.out.printf("从%d转移%d能量到%d", from, amount, to);
			values[to] += amount;
			System.out.printf("能量总和：%d%n", getTotalEnergies());
		}

	}

	public int getTotalEnergies() {
		int total = 0;
		for (int i : values)
			total += i;
		return total;
	}

	public int getSize() {
		return values.length;
	}

	public int[] getValues() {
		return values;
	}

	public void setValues(int[] values) {
		this.values = values;
	}

}
