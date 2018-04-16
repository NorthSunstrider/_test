package com.northsunstrider.clz;

public class ClzTest {

	public static void main(String[] args) {
		extendTest();
	}

	public static void method1() {

		Airplane airplane = new Airplane();
		Bird bird = new Bird();
		airplane.fly();
		bird.fly();
		Fly bat = new Bat();
		bat.fly();
	}

	public static void method2() {
		A1 a1 = new A2();
		a1.eat();
		a1.wear();
		A2 a2 = new A2();
		String s = a2.name;

	}

	public static void method3() {
		Constructor c = new Constructor("ss");
	}

	/*
	 * 测试继承关系中，new一个对象时，java的执行逻辑 
	 * 结论：先生成父类再生成子类
	 */
	public static void extendTest() {
		Father f = new Child();
	}
}
