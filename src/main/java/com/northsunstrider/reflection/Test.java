package com.northsunstrider.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年10月29日 上午7:20:37
 */
public class Test {

	/**
	 * @Description TODO
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			a();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void a()
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		PrivateClass pt = new PrivateClass();
		Class<?> clazz = PrivateClass.class;

		// 获得指定类的属性
		Field field = clazz.getDeclaredField("name");
		// 值为 true 则指示反射的对象在使用时应该取消 Java 语言访问检查。值为 false 则指示反射的对象应该实施 Java
		// 语言访问检查。
		field.setAccessible(true);
		// 更改私有属性的值
		field.set(pt, "world");
		System.out.println(pt.getName());

	}

	public static void b() {
		Apple test = new Apple("张三");

		Method[] methods = Test.class.getMethods();
		Field[] fields = Test.class.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			fields[i].setAccessible(true);
			try {
				System.out.println(fields[i].get(test));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(fields[i].getName());
		}
	}

}
