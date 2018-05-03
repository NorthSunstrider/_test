package com.northsunstrider.clz;

/**
 * @Description: 测试类的转换
 * @author: North
 * @date: 2018年4月22日 下午3:17:48
 */
public class ClzTest2 {

	/**
	 * @Description main
	 * @param args
	 */
	public static void main(String[] args) {
		// classConverteTest();
		classConverteTest1();

		// classConverteTest2();
	}

	// 观察child 对象和father对象的类名及属性，以及赋值后的情况
	public static void classConverteTest() {
		Child child = new Child();
		Father father = new Father();
		father = child;

		System.out.println(father.getClass() + " name: " + father.name);
		System.out.println(child.getClass() + " name: " + child.name);

	}

	// 观察child 对象和father对象的类名及属性，以及赋值后的情况
	// 会报错，类型转换错误
	public static void classConverteTest1() {
		Child child = new Child();
		Father father = new Father();

		child = (Child) father;

		System.out.println(father.getClass() + " name: " + father.name);
		System.out.println(child.getClass() + " name: " + child.name);
	}

	// 观察child 对象和father对象的类名及属性，以及赋值后的情况
	public static void classConverteTest2() {
		Child child = new Child();
		Father father = new Child();

		// child = (Child) father;
		System.out.println(father.getClass() + " name: " + father.name);
		System.out.println(child.getClass() + " name: " + child.name);
	}
}
