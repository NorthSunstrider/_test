package com.northsunstrider.designpattern.builder.kfc;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月23日 下午6:41:22
 */
public interface Hamburger extends Packing {

	@Override
	default void pack() {
		System.out.println("纸质包装");
	}

}
