package com.northsunstrider.clz;

public class Child extends Father {
	static String name = "child";

	public Child() {
		System.out.println("Child constructor ");

	}

	{
		System.out.println("Child static block ");

	}
}
