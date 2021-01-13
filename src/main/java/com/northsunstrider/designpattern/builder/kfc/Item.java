package com.northsunstrider.designpattern.builder.kfc;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月23日 下午6:43:33
 */
public class Item {
	private Cola cola;
	private Hamburger hamburger;

	public Item(Cola cola, Hamburger hamburger) {
		super();
		this.cola = cola;
		this.hamburger = hamburger;
	}

	public Cola getCola() {
		return cola;
	}

	public void setCola(Cola cola) {
		this.cola = cola;
	}

	public Hamburger getHamburger() {
		return hamburger;
	}

	public void setHamburger(Hamburger hamburger) {
		this.hamburger = hamburger;
	}

}
