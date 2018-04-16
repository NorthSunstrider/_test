package com.northsunstrider.innerclass;

public class TestInnerClassAccess {

	public static void main(String[] args) {
		TestInnerClassAccess tic = new TestInnerClassAccess();
		InnerClass ic = tic.new InnerClass();
		ic.methodA(0);
	}

	private int a = 0;
	public int b = 0;

	class InnerClass {
		int c = 0;

		private void methodA(final int d) {
			int e = 0;
			System.out.println(a);
			System.out.println(b);

			System.out.println(c);

			System.out.println(d);

			System.out.println(e);

		}
	}
}
