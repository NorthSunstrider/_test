package com.northsunstrider.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月24日 下午8:05:34
 */
public class ProxyFactory {
	private Object target;

	public ProxyFactory(Object target) {
		super();
		this.target = target;
	}

	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("before");
						Object returnValue = method.invoke(target, args);
						System.out.println("after");
						return returnValue;
					}
				});
	}
}
