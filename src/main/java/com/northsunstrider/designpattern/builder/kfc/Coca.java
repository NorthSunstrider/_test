package com.northsunstrider.designpattern.builder.kfc;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月23日 下午6:34:54
 */
public class Coca implements Cola {
	private String name = "可口可乐";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @Description TODO
	 */
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Coca coca = new Coca();
		System.out.println(coca.getName());
		coca.pack();
	}

}
