package com.northsunstrider.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年4月26日 上午2:44:38
 */
public class TestB {

	/**
	 * @Description TODO
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "a";
		String s2 = "b";
		System.out.println(s1 == s2);

		a();

	}

	public static void jump() {
		flag: for (;;) {
			System.out.println("hello");
			break flag;
		}
	}

	public static void a() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		for (int i = 0; i < list.size(); i++) {
			String str = (String) list.get(i);
			System.out.println(str);
		}

	}
}
