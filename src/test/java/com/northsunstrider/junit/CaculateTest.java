package com.northsunstrider.junit;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @Description: junit
 * @author: North
 * @date: 2018年5月2日 上午9:51:58
 */
public class CaculateTest {

	/**
	 * @Description test add
	 */
	@Test
	public void add() {
		assertEquals(8, new Calculate().add(3, 5));
	}

	@Test
	public void minus() {
		assertEquals(-2, new Calculate().minus(3, 5));
	}
}
