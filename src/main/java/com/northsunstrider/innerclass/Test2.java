package com.northsunstrider.innerclass;

public class Test2 {
	private int num;

	public Test2() {
		super();
	}

	public Test2(int num) {
		super();
		this.num = num;
	}
	
	class Inner{
		
		public Test2 getTest2(){
			return Test2.this;
		}
		
		public Test2 newTest2(){
			return new Test2();
		}
		
	}
	
	public static void main(String[] args) {
		Test2 ta=new Test2(5);
		Test2.Inner inner = ta.new Inner();
		Test2 tb=inner.getTest2();
		Test2 tc=inner.newTest2();
		System.out.println(tb.num);
		System.out.println(tc.num);
		
	}
}
