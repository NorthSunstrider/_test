package com.northsunstrider.clz;

/**
 * @Description: 请回答程序的输出结果
 * @author: North
 * @date: 2018年4月19日 下午6:43:00
 */
public class ClzTest1 {
	public static void main(String[] args) {
		P b = new B();
		System.out.println(b.a);
	}

	static class P {
		public int a = 11;

		public P() {
			a = 22;
			diplay();
		}

		public void diplay() {
			System.out.println("I am in P, value is " + a);
		}
	}

	static class B extends P {
		int a = 33;

		public B() {
			a = 44;
			diplay();
		}

		public void diplay() {
			System.out.println("I am in B, value is " + a);
		}
	}
}
