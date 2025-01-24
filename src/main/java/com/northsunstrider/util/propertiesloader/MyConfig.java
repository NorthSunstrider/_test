package com.northsunstrider.util.propertiesloader;

import java.io.InputStream;
import java.util.Properties;

/**
 * @Description: 使用原始方法管理属性文件
 * @author: North
 * @date: 2018年8月18日 下午7:02:12
 */
public class MyConfig {
	public static String NAME = null;
	public static int AGE = 0;

	static {
		Properties pro = new Properties();
		InputStream in = MyConfig.class.getClassLoader().getResourceAsStream("MyConfig.properties");
		try {
			pro.load(in);
			NAME = pro.getProperty("name");
			AGE = Integer.valueOf(pro.getProperty("age"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
