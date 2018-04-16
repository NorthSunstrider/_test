/**
 * 
 */
package com.northsunstrider.local;

import java.util.Locale;
import java.util.ResourceBundle;

/** 
 * @author North 
 * @date 2016年1月29日 下午12:35:33 
 * @version V1.0
 */
public class LocalTest {

	public static void main(String[] args) {
		test();
	}

	public static void test() {
		Locale locale = new Locale("zh", "cn");

		ResourceBundle resourceBundle = ResourceBundle.getBundle("myres", locale);
		System.out.println(resourceBundle.getString("name"));

		Locale locale2 = new Locale("en", "us");

		ResourceBundle resourceBundle2 = ResourceBundle.getBundle("myres", locale2);
		System.out.println(resourceBundle2.getString("name"));
	}
}
