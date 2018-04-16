package com.northsunstrider.methodtransmit;

//测试数组类型在方法中的传递
public class ArrayTypeMethodTransmitTest {

	public static void main(String[] args) {
		arrayTransmitTest();
	}

	public static void arrayTransmit(int []array){
		array[0]=5;
	}
	public static void arrayTransmitTest(){
		int numbers[]={1,2,3,4,7};
		arrayTransmit(numbers);
		System.out.println(numbers[0]);
	}
}
