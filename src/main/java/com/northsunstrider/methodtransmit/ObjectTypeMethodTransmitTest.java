package com.northsunstrider.methodtransmit;

//测试对象类型的值在方法中的传递
public class ObjectTypeMethodTransmitTest {

	public static void main(String[] args) {
		objectTransmitTest();
		// objectTransmit1Test();
	}

	public static void objectTransmit(A a) {
		System.out.println("a" + a);

		a.setName("update by method");
		System.out.println("a" + a);

	}

	public static void objectTransmitTest() {
		A a = new ObjectTypeMethodTransmitTest().new A("default");
		System.out.println("a" + a);

		objectTransmit(a);
		System.out.println("a" + a);

		System.out.println(a.name);
	}

	public static void objectTransmit1(A a) {

		A a1 = new ObjectTypeMethodTransmitTest().new A();
		a1.setName("cba");
		a.setName("abc");
		System.out.println("a" + a);
		System.out.println("a1" + a1);
		a = a1;
		System.out.println("a" + a);
		System.out.println("a1" + a1);
	}

	public static void objectTransmit1Test() {
		A obj = new ObjectTypeMethodTransmitTest().new A();
		System.out.println("obj" + obj);
		objectTransmit1(obj);
		System.out.println("obj" + obj);

		System.out.println(obj.getName());

	}

	class A {
		private String name;

		private A(String name) {
			super();
			this.name = name;
		}

		public A() {
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return this.name;
		}

	}

}
