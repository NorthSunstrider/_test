package com.northsunstrider.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年4月28日 上午8:54:15
 */
public class TestC {

	private final String name;

	/**
	 * Constructor
	 */
	public TestC(String str) {
		name = str;
	}

	/**
	 * @Description TODO
	 * @param args
	 */
	public static void main(String[] args) {

		// methodB();
		// testParams(1,2,1);

		List list = new ArrayList();
		list.add("qqyumidi");
		list.add("corn");
		list.add(100);

		for (int i = 0; i < list.size(); i++) {
			String name = (String) list.get(i); // 1
			System.out.println("name:" + name);
		}
	}

	public static void someMethodA() {
		// interface Collection
		List list = Collections.EMPTY_LIST;
		Collections.sort(list);
		new ArrayList<>();
		new LinkedList<>();
		new HashMap<>();
		new HashSet<>();
		new TreeMap<>();
		new TreeSet<>();
		new Hashtable<>();
		Map map;
		Set set;
		List list1;

	}

	public static void methodB() {
		ABC abc = new ABC();
		ABC otherName = abc;

		abc.setA(999);
		System.out.println(otherName.getA());
	}

	// 动态参数
	public static void testParams(int... is) {
		System.out.println(is.length);
		for (int i : is) {
			System.out.println(i);
		}
	}

	public static void testParams1(ABC... abcs) {
	}
}
