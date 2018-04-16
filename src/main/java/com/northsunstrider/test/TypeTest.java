package com.northsunstrider.test;

import java.util.Arrays;

public class TypeTest {
	public static void main(String[] args) {
		array1();
	}

	public static void method1() {
		int i = 123456789;
		float f = i;
		System.out.println(f);
		int i1 = (int) f;
		System.out.println(i1);
	}

	public static void method2() {

		String greeting = "hello";
		int cpCount = greeting.codePointCount(0, greeting.length());
		System.out.println(cpCount);
	}
	
	public static void array1(){
		int a[]={1,3};
		int a1[]= Arrays.copyOf(a, 2);
		int[] a2={5,6,7};
		a= Arrays.copyOf(a, 4);
//		a2=Arrays.copyOf(a1, 5);
		a2=a1;
		System.out.println(a2.length);
	}
}
