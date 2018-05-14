package com.northsunstrider.javassist;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

/**
 * @Description: 测试javassist
 * @author: North
 * @date: 2018年5月12日 上午11:33:05
 */
public class ChangeDemo {

	/**
	 * @Description main
	 * @param args
	 */
	public static void main(String[] args) {
		replaceMethodBody("com.northsunstrider.javassist.Student", "execute",
				"System.out.println(\"execute method,changed by javassist\");");
		Student student = new Student();
		student.execute();
	}

	// 在不修改代码的前提下，通过javassist修改类的方法
	// 必须在类未被classloader加载前执行
	public static void replaceMethodBody(String clzName, String methodName, String newMethodBody) {
		try {
			CtClass clz = ClassPool.getDefault().get(clzName);
			CtMethod method = clz.getDeclaredMethod(methodName);
			method.setBody(newMethodBody);
			clz.toClass();
		} catch (Exception e) {
		}
	}

}
