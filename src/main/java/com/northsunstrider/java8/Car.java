package com.northsunstrider.java8;

import java.util.function.Supplier;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月3日 上午9:08:51
 */
public class Car {
	public static Car create(Supplier<Car> supplier) {
		return supplier.get();
	}
}
