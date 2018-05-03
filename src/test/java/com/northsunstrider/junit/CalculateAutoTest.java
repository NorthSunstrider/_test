package com.northsunstrider.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @Description: junit自动生成测试类
 * @author: North
 * @date: 2018年5月2日 上午10:02:39
 */
public class CalculateAutoTest {

	/**
	 * Test method for
	 * {@link com.northsunstrider.junit.Calculate#add(int, int)}.
	 */
	@Test
	public void testAdd() {
		assertEquals(8, new Calculate().add(3, 5));
	}

	/**
	 * Test method for
	 * {@link com.northsunstrider.junit.Calculate#minus(int, int)}.
	 */
	@Test
	public void testMinus() {
		assertEquals(-2, new Calculate().minus(3, 5));
	}

}
