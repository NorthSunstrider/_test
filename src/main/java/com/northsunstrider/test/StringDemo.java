package com.northsunstrider.test;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年6月1日 下午8:34:09
 */
public class StringDemo {
	private static final String MESSAGE = "taobao";

	public static void main(String[] args) {
		String a = "tao" + "bao";
		String b = "tao";
		String c = "bao";
		System.out.println(a == MESSAGE);
		System.out.println((b + c) == MESSAGE);

		String s = "abc";
		String s1 = "abc";
		System.out.println(s == s1);
		String s2 = new String("abc");
		System.out.println(s == s2);
	}
}