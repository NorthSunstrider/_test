package com.northsunstrider.designpattern.builder;

import org.junit.Test;

import junit.framework.Assert;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月23日 下午1:46:25
 */
public class CarTest {

	@Test
	public void test() {
		CarBuilder carBuilder = new CarBuilder();
		carBuilder=carBuilder.build();
		Car car = carBuilder.getCar();

		carBuilder.buildEngien("涡轮增压").buildFrame("炭纤维").buildWheel("橡胶");
		Car c2 = carBuilder.getCar();
		System.out.println(car.getEngine().getName());
	}

}
