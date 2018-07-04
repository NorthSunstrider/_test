package com.northsunstrider.designpattern.singleton;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月23日 上午9:38:08
 */
public class Singleton {

	private static Singleton singleton;

	private Singleton() {
		super();
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null)
					singleton = new Singleton();
			}

		}
		return singleton;
	}

}
