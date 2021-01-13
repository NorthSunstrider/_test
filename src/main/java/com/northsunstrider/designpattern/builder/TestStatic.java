package com.northsunstrider.designpattern.builder;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月23日 下午1:34:23
 */
public class TestStatic {

	public static int staticValue = 0;
	public static int normalValue = 0;


	@Test
	public void test() {
		TestStatic testStatic = new TestStatic();
		testStatic.staticValue--;
		TestStatic ts1 = new TestStatic();
		Assert.assertEquals(-1, ts1.staticValue);
	}

}
