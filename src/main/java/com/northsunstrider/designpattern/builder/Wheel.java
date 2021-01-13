package com.northsunstrider.designpattern.builder;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月23日 下午1:22:53
 */
public class Wheel {
	private String name;

	public Wheel() {
		super();
		name = "default";
	}

	public Wheel(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
