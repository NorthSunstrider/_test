package com.northsunstrider.designpattern.proxy;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月24日 下午8:11:22
 */
public class ProxyTest {
	public static void main(String[] args) {
		testUserDao();
	}

	public static void testObjectProxy() {
		Object object = new Object();
		Object proxy = new ProxyFactory(object).getProxyInstance();
		proxy.toString();

	}

	public static void testUserDao() {
		IUserDao target = new UserDao();
		System.out.println(target.getClass());

		// 给目标对象，创建代理对象
		IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
		// class $Proxy0 内存中动态生成的代理对象
		System.out.println(proxy.getClass());

		// 执行方法 【代理对象】
		proxy.save();

	}
}
