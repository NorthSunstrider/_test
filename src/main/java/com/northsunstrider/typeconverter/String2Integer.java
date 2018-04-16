package com.northsunstrider.typeconverter;

public class String2Integer {

	public static void main(String[] args) {
		System.out.println(methodA());
	}

	// 将“1010”转换为10
	public static int methodA() {
		String str = "1010";
		int a = Integer.parseInt(str, 2);
		return a;

	}
}
