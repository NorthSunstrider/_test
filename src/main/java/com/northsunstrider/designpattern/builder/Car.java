package com.northsunstrider.designpattern.builder;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月23日 下午1:17:37
 */
public class Car {

	private Frame frame;
	private Engine engine;
	private Wheel wheel;

	public Car() {
		super();

	}

	public Car(Frame frame, Engine engine, Wheel wheel) {
		super();
		this.frame = frame;
		this.engine = engine;
		this.wheel = wheel;
	}

	public Frame getFrame() {
		return frame;
	}

	public void setFrame(Frame frame) {
		this.frame = frame;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

}
