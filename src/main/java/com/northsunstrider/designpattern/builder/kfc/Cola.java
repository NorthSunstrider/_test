package com.northsunstrider.designpattern.builder.kfc;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月23日 下午6:33:00
 */
public interface Cola extends Packing {

	@Override
	default void pack() {
		System.out.println("瓶装");
	}

}
