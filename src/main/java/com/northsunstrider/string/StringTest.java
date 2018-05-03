package com.northsunstrider.string;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年4月14日 下午3:54:55
 */
public class StringTest {

	/**
	 * @Description main方法
	 * @param args
	 */
	public static void main(String[] args) {
		compareStringTest();
		stringPlusStringBuilderTest();
	}

	/**
	 * @Description 用==符号比较值相同的String对象
	 */
	public static void compareStringTest() {
		String s1 = "abc";
		String s2 = "a" + new String("bc");

		// 运行结果为false
		System.out.println(s1 == s2);
	}

	/**
	 * @Description 测试String和StringBuilder是否可以使用符号'+'
	 */
	public static void stringPlusStringBuilderTest() {
		String s = "1bc";
		StringBuilder sb = new StringBuilder("aaa");
		// 编译可以通过，String和StringBuilder可以使用符号'+'
		System.out.println(s + sb);
	}

	/**
	 * @Description 测试Java中的三个String对象
	 */
	public static void threeStringObjectTest() {
		String str = new String("aaa");
		StringBuffer sb = new StringBuffer("sbsb");
		StringBuilder stringBuilder = new StringBuilder("builder");

		char a = 'a';
		// 报错
		// char b="a";
		char c='他';
	}

}
