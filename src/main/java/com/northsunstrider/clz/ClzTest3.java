package com.northsunstrider.clz;

/**
 * @Description: 类的相关测试
 * @author: North
 * @date: 2018年4月22日 下午3:45:22
 */
public class ClzTest3 {

	/**
	 * @Description main
	 * @param args
	 */
	public static void main(String[] args) {
		instanceTest1();
	}

	// instance of 方法
	public static void instanceTest1() {
		Child child = new Child();
		Father father = new Father();

		System.out.println((father instanceof Father));
		System.out.println((child instanceof Child));
		System.out.println((father instanceof Child));
		System.out.println((child instanceof Father));
	}
}
