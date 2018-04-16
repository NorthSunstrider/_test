package com.northsunstrider.collection;

import java.util.Vector;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年4月16日 下午5:54:00
 */
public class VectorTest {

	/**
	 * @Description TODO
	 * @param args
	 */
	public static void main(String[] args) {
		test();
		aaa();
	}

	public static void test() {
		Vector<Object> vector = new Vector<>();
		vector.add('s');
		vector.addElement(1);

		for (Object o : vector)
			System.out.println(o.toString());
	}
	
	public static void aaa(){
		throw new Error();
	}
}
