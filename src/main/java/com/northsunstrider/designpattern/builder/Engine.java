package com.northsunstrider.designpattern.builder;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月23日 下午1:22:06
 */
public class Engine {
	private String name;

	public Engine() {
		super();
		this.name = "default";
	}

	public Engine(String name) {
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
