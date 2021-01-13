package com.northsunstrider.designpattern.iterator;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月31日 下午5:35:54
 */
public interface MyIterator {
	void first();// 将游标指向第一个元素

	void next();// 将游标指向下一个元素

	boolean hasNext();// 判断是否有下一个元素

	boolean isFirst();// 判断是否是第一个元素

	boolean isLast();// 判断是否是最后一个元素

	Object getCurrentObj();// 获取当前对象
	
	public int getCursor() ;
}
