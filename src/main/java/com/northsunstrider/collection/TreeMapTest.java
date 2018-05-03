package com.northsunstrider.collection;

import java.util.TreeMap;

/**
 * @Description: 测试TreeMap
 * @author: North
 * @date: 2018年4月21日 下午12:31:27
 */
public class TreeMapTest {

	/**
	 * @Description main
	 * @param args
	 */
	public static void main(String[] args) {
		testInit();
	}

	public static void testInit() {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(0, "0");
		treeMap.put(-1, "-1");
		treeMap.put(1, "1");

		treeMap.put(43, "43");

		String str = treeMap.get(2);
		System.out.println(str);
	}

}
