package com.northsunstrider.designpattern.builder.kfc;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月23日 下午6:46:09
 */
public enum ItemType {
	SUSHITAOCAN1(new Coca(), new VegetableHamburger()), BAISHITAOCAN1(new Pepsi(), new MeatHamburger()),;

	private Cola cola;
	private Hamburger hamburger;

	private ItemType(Cola cola, Hamburger hamburger) {
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
