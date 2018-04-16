package com.northsunstrider.innerclass;

public class TestGoods {

	public static void main(String[] args) {
		Goods p = new Goods();
		Contents c = p.cont();
		System.out.println(c.value());
		Destionation d = p.dest("Beijing");
		System.out.println(d.readLabel());
	}

}
