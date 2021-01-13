package com.northsunstrider.test;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月24日 上午8:21:31
 */
public class Shape {
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Shape shape=new Shape();
		Shape s=(Shape) shape.clone();
		System.out.println("aaa");
	}
}
