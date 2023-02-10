package com.northsunstrider.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Description: lambda
 * @author: North
 * @date: 2018年5月2日 上午8:59:35
 */
public class TestArraySort {

	/**
	 * @Description main
	 * @param args
	 */
	public static void main(String[] args) {
		arraySort();

		arraySortOriginal();

	}

	/**
	 * @Description 用lambda实现比较
	 */
	public static void arraySort() {
		List<String> list = Arrays.asList("a", "b", "d", "b", "c");
		list.sort((e1, e2) -> e1.compareTo(e2));
		System.out.println(list.toString());
	}

	/**
	 * @Description 用lambda实现比较,相比于arraySort()方法，这里显式的定义了返回值
	 *              如果lambda表达式只有一行的话，可省略
	 */
	public static void arraySort1() {
		List<String> list = Arrays.asList("a", "b", "d", "b", "c");
		list.sort((e1, e2) -> {
			int result = e1.compareTo(e2);
			return result;
		});
		System.out.println(list.toString());
	}

	/**
	 * @Description 传统方式实现比较
	 */
	public static void arraySortOriginal() {
		List<String> list = Arrays.asList("a", "b", "d", "b", "c");
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println(list.toString());
	}

}
