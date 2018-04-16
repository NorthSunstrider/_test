package com.northsunstrider.enumeration;

public enum Poker {
	heitao1(0,0),heitao2(0,1);

	private int color;
	private int number;
	
	private Poker(int color, int number) {
		this.color = color;
		this.number = number;
	}
	

}
