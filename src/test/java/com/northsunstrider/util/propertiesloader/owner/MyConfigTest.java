package com.northsunstrider.util.propertiesloader.owner;

import static org.junit.Assert.*;

import org.aeonbits.owner.ConfigFactory;
import org.junit.Test;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年8月18日 下午6:53:11
 */
public class MyConfigTest {

	/**
	 * Test method for
	 * {@link com.northsunstrider.util.propertiesloader.owner.MyConfig#name()}.
	 */
	@Test
	public void testName() {
		MyConfig myConfig = ConfigFactory.create(MyConfig.class);
		assertEquals("north", myConfig.name());
	}

	/**
	 * Test method for
	 * {@link com.northsunstrider.util.propertiesloader.owner.MyConfig#age()}.
	 */
	@Test
	public void testAge() {
		MyConfig myConfig = ConfigFactory.create(MyConfig.class);
		assertEquals(11, myConfig.age());
	}

}
