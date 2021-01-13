package com.northsunstrider.designpattern.builder;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月23日 下午1:20:04
 */
public class Frame {
	private String name;

	public Frame() {
		super();
		name = "default";
	}

	public Frame(String name) {
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
