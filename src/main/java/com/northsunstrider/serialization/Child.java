package com.northsunstrider.serialization;

import java.io.Serializable;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月3日 上午10:24:55
 */
public class Child extends Parent implements Serializable {

	int child = 50;

	public int getChild() {
		return child;
	}

	public void setChild(int child) {
		this.child = child;
	}

}
