package com.northsunstrider.designpattern.builder;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月23日 下午1:27:51
 */
public class CarBuilder {
	private Car car;

	public CarBuilder build() {
		Frame frame = new Frame();
		Engine engine = new Engine();
		Wheel wheel = new Wheel();
		Car car = new Car(frame, engine, wheel);
		CarBuilder carBuilder = new CarBuilder();
		carBuilder.setCar(car);
		
		return carBuilder;
	}

	public CarBuilder buildEngine() {
		car.setEngine(new Engine());
		return this;
	}

	public CarBuilder buildEngien(String str) {
		car.setEngine(new Engine(str));
		return this;
	}

	public CarBuilder buildFrame() {
		car.setFrame(new Frame());
		return this;
	}

	public CarBuilder buildFrame(String str) {
		car.setFrame(new Frame(str));
		return this;
	}

	public CarBuilder buildWheel() {
		car.setWheel(new Wheel());
		return this;
	}

	public CarBuilder buildWheel(String str) {
		car.setWheel(new Wheel(str));
		return this;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
