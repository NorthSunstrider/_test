package com.northsunstrider.clz;

/**
 * @Description: 测试类中的静态变量
 * @author: North
 * @date: 2018年4月24日 上午10:46:18
 */
public class StaticParameterTest {

	// 加了static修饰符，所有类的对象都共用该i
	static int i = 0;

	/**
	 * @Description main
	 * @param args
	 */
	public static void main(String[] args) {
		StaticParameterTest s1 = new StaticParameterTest();
		s1.i = -10;
		StaticParameterTest s2 = new StaticParameterTest();
		System.out.println(s2.i);
		
	}

}
