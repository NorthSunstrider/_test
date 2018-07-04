package com.northsunstrider.designpattern.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月23日 下午1:06:53
 */
public class DataSourceEnumTest {

	/**
	 * Test method for
	 * {@link com.northsunstrider.designpattern.singleton.DataSourceEnum#getInstance()}.
	 */
	@Test
	public void testGetInstance() {
		DBConnection dbc1 = DataSourceEnum.DATASOURCE.getInstance();
		DBConnection dbc2 = DataSourceEnum.DATASOURCE.getInstance();
		assertEquals(dbc1, dbc2);
	}

}
