package com.northsunstrider.clz;

public class Father {
	static String name = "father";

	{
		System.out.println("Father static block ");
	}

	public Father() {
		System.out.println("Father Constructor ");

	}
}
