package com.northsunstrider.accessmodifier;

public class Test {

	public static void main(String[] args) {
	}

	public static void methodClassTest() {
		MethodClass.publicMethod();
		MethodClass mc = new MethodClass();
		mc.publicMethod();
	}
}
