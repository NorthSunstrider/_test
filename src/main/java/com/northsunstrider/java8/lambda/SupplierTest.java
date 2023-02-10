package com.northsunstrider.java8.lambda;

import java.util.function.Supplier;
import java.util.logging.Logger;

import org.junit.Test;

import com.northsunstrider.clz.Father;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月2日 上午9:21:04
 */
public class SupplierTest {

	@Test
	public void test() {
		Supplier<Father> supplier = () -> new Father();
		Father father = supplier.get();
		Logger.getGlobal().info(father.toString());
		Logger.getGlobal().info(supplier.get().toString());

	}

}
