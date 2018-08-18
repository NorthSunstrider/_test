package com.northsunstrider.util.propertiesloader.owner;

import org.aeonbits.owner.ConfigFactory;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年8月18日 下午6:34:35
 */
public class Test {

	/**
	 * @Description TODO
	 * @param args
	 */
	public static void main(String[] args) {
		getValue();
	}

	public static void getValue() {
		MyConfig myConfig = ConfigFactory.create(MyConfig.class);

		// 如果配置文件中没有该属性String会返回Null,int 会报空指针异常
		String name = myConfig.name();
		int age = myConfig.age();

		System.out.println(name + age);
	}
}
