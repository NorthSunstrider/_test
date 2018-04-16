package com.northsunstrider.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年4月14日 下午3:29:38
 */
public class ArrayListTest {

	public static void main(String[] args) {
		deleteInForLoopTest();
	}

	/**
	 * 从list中移除元素
	 */
	public static void deleteElementFromArrayList() {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 10; i++)
			list.add(i + "");

		System.out.println(list.size());
		list.remove(0);
		System.out.println(list.size());
	}

	/**
	 * 在for each循环中移除list中元素 <br/>
	 * 会报错：java.util.ConcurrentModificationException
	 */
	public static void deleteInForEachLoopTest() {
		ArrayList<String> list = getArrayListInitWithString(10);

		for (String s : list)
			list.remove(s);

	}

	/**
	 * 在for循环中移除list元素
	 */
	public static void deleteInForLoopTest() {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 10; i++)
			list.add(i + "");

		for (int j = 0; j < 10; j++)
			list.remove(j + "");

	}

	/**
	 * @Description 用String初始化列表
	 * @param size
	 * @return
	 */
	public static ArrayList<String> getArrayListInitWithString(int size) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < size; i++)
			list.add(i + "");
		return list;
	}

}
