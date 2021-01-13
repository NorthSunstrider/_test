package com.northsunstrider.java8;

/**
 * @Description: TODO
 * 如果实现2个有同名方法的接口，那么当实现类必须重写实现方法的时候，就无所谓实现的是接口1还是接口2的方法，因为最后执行的都是实现类的方法
 * 如果实现2个同名但返回类型不同的接口，那么实现类报错，即无法实现这样的两个接口
 * 如果实现2个同名且都有defalt参数的接口，那么实现类必须重写实现方法，也可以在实现方法中调用接口的实现方法
 * 如果实现2个同名但只有一个是default的接口，那么实现类必须实现没有default参数的接口，实现后的方法又会覆盖掉default接口的默认方法
 * 如果类的父类中已经继承了A接口，那么在类的声明中再次声明继承A接口没有意义
 * @author: North
 * @date: 2018年9月9日 下午11:16:15
 */
public class ImplementDemo implements Interface2, Interface1 {


	public static void main(String[] args) {
		ImplementDemo demo = new ImplementDemo();
		demo.print();
		
		ImplementDemo2 demo2=new ImplementDemo2();
		demo2.print();
	}

	public void print() {
//		Interface2.super.print();
		System.out.println("demo 1");
	}

}

interface Interface1 {
	default void print() {
		System.out.println("Interface1");
	}
}

interface Interface2 {
	default void print() {
		System.out.println("Interface2");
	}
}

class ImplementDemo2 extends ImplementDemo implements Interface1{
	
	
}