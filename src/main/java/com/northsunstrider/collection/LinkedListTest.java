package com.northsunstrider.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * 测试链表
 */
public class LinkedListTest {

	// 控制添加元素数量的常量
	private static int N = 500000;

	public static void main(String[] args) {
		reverseLinkedList();
	}

	/**
	 * @Description 比较linkedList和ArrayList的性能
	 */
	public static void testLinkedListAndArrayList() {
		/*
		 * 指定往list结尾插入 50000条数据，没差别 500000，array 11ms，link 51ms 5000000，array
		 * 1012,link 3043
		 * 
		 * 指定往list开头插入 50000，array 277ms,link 4ms 500000，array 29782ms,link 60ms
		 */
		List arrayList = testArraySave();
		List linkedList = testLinkSave();

		// testArrayRemoveByIndex(testArraySave());
		// testArrayRemoveByObject(testArraySave());
		//
		// testLinkRemoveByIndex(testLinkSave());
		// testLinkRemoveByObject(testLinkSave());
	}

	// 测试链表的增删改查
	public static void curd() {
		// 数据定义
		String user1 = "zhang san";
		String user2 = "li si";

		LinkedList list = new LinkedList<>();
		list.add(user1);
		list.remove(user1);
		list.remove(0);

	}

	// 测试往arraylist中添加五万条数据的时间
	public static List testArraySave() {
		long start = System.currentTimeMillis();
		List list = new ArrayList<>();
		for (int i = 0; i < N; i++)
			list.add(0, new Integer(i));
		System.out.println("add to arraylist : " + (System.currentTimeMillis() - start));
		return list;
	}

	// 测试往linkedlist中添加五万条数据的时间
	public static List testLinkSave() {
		long start = System.currentTimeMillis();
		List list = new LinkedList<>();
		for (int i = 0; i < N; i++)
			list.add(0, new Integer(i));
		System.out.println("add to linkedlist : " + (System.currentTimeMillis() - start));
		return list;
	}

	// 测试往ArrayList中删除数据
	public static void testArrayRemoveByObject(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < N; i++)
			list.remove(new Integer(i));
		System.out.println("remove from arraylist by object : " + (System.currentTimeMillis() - start));
	}

	// 测试往ArrayList中删除数据
	public static void testArrayRemoveByIndex(List list) {
		long start = System.currentTimeMillis();
		for (int i = N - 1; i >= 0; i--)
			list.remove(i);
		System.out.println("remove from arraylist by index : " + (System.currentTimeMillis() - start));
	}

	// 测试往LinkList中删除数据
	public static void testLinkRemoveByObject(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < N; i++)
			list.remove(new Integer(i));
		System.out.println("remove from arraylist by index : " + (System.currentTimeMillis() - start));
	}

	// 测试往LinkList中删除数据
	public static void testLinkRemoveByIndex(List list) {
		long start = System.currentTimeMillis();
		for (int i = N - 1; i >= 0; i--)
			list.remove(i);
		System.out.println("remove from arraylist by index : " + (System.currentTimeMillis() - start));
	}

	/**
	 * @Description 用从String化的数字初始化列表
	 * @param size
	 */
	public static LinkedList<String> initLinkedList(int size) {
		LinkedList<String> linkedList = new LinkedList<>();
		for (int i = 0; i < size; i++)
			linkedList.add(i + "");
		return linkedList;
	}

	/**
	 * @Description 通过新建一个列表，然后从前列表中倒序取出数据并存储的方式实现反转
	 */
	public static void reverseLinkedList() {
		LinkedList<String> linkedList = initLinkedList(100);
		LinkedList<String> targetList = new LinkedList<>();
		int loop = linkedList.size();
		for (int i = 0; i < loop; i++) {
			String temp = linkedList.pollFirst();
			targetList.addFirst(temp);
		}
		for (String s : linkedList)
			System.out.print(s);
		System.out.println();
		for (String s : targetList)
			System.out.print(s);
	}
	
	public static void reverseLinkedListByPreAndNext() {
		LinkedList<String> linkedList = initLinkedList(100);
		int loop = linkedList.size();
		linkedList.getFirst();
	}
	
	

}
