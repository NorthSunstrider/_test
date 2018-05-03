package com.northsunstrider.clz;

public class A2 extends A1 {
	static String name = "aa";

	/**
	 * Constructor
	 */
	public A2() {
		name = "changed in constructor";
	}

	@Override
	protected void wear() {
		// TODO Auto-generated method stub
		System.out.println("衣");
	}

	public void live() {
		System.out.println("live");
	}

}
