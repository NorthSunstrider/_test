/**
 * 
 */
package com.northsunstrider.entity2map;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/** 
 * @author North 
 * @date 2016年1月29日 下午2:30:09 
 * @version V1.0
 */
public class User0129 {

	private String username;
	private String password;
	private int age;

	public User0129() {
		super();
	}

	public User0129(String username, String password, int age) {
		super();
		this.username = username;
		this.password = password;
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Map<String, Object> toMap2() {

		for (Field f : this.getClass().getDeclaredFields()) {
			try {
				// this.getClass().getField(f.getName());
				System.out.println(f.getName());
				Field f1 = this.getClass().getDeclaredField(f.getName());
				System.out.println(f1.getInt(f.getName()));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	public static Map<String, Object> beanToMap(Object entity) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		Field[] fields = entity.getClass().getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			String fieldName = fields[i].getName();
			Object o = null;
			String firstLetter = fieldName.substring(0, 1).toUpperCase();
			String getMethodName = "get" + firstLetter + fieldName.substring(1);
			Method getMethod;
			try {
				getMethod = entity.getClass().getMethod(getMethodName, new Class[] {});
				o = getMethod.invoke(entity, new Object[] {});
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (o != null) {
				parameter.put(fieldName, o);
			}
		}
		return parameter;
	}

	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		Field[] fields = this.getClass().getDeclaredFields();
		for (Field field : fields) {
			Object obj;
			try {
				obj = field.get(this);
				if (obj != null) {
					map.put(field.getName(), obj);
				}
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return map;
	}

	public Map<String, Object> toMap3(Object entity) {
		Map<String, Object> map = new HashMap<String, Object>();
		Field[] fields = entity.getClass().getDeclaredFields();
		for (Field field : fields) {
			Object obj;
			try {
				obj = field.get(entity);
				if (obj != null) {
					map.put(field.getName(), obj);
				}
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return map;
	}

	public static void main(String[] args) {
		 User0129 user0129 = new User0129("name", "123456", 0);
		 Map<String, Object> map = user0129.toMap3(user0129);
		// Map<String, Object> map = beanToMap(user0129);

//		testString();
	}

	public static void testString() {
		String abc = "{password=123456, age=0, username=name}";
		abc = abc.replaceAll(",", "&");
		abc = abc.replace("{", "");
		abc = abc.replace("}", "");
		abc = abc.replaceAll(" ", "");
		abc = abc.replaceAll(" ", "");
		abc = abc.trim();
		System.out.println(abc);
	}

}
