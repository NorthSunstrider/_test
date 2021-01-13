package com.northsunstrider.designpattern.iterator;

import org.junit.Assert;

import com.northsunstrider.test.ABC;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月31日 下午5:36:55
 */
public class Test {

	@org.junit.Test
	public void aaa() {
		ABC abc=new ABC();
		
		ConcreteMyAggregate cma = new ConcreteMyAggregate();
		cma.addObject("111");
		cma.addObject("222");
		cma.addObject("333");
		cma.addObject("444");

		MyIterator iterator = cma.createIterator();
		Assert.assertEquals(0, iterator.getCursor());
		cma.removeObject("111");// 如果删除一个元素的话，迭代的时候也同样会被删除
		while (iterator.hasNext()) {
			System.out.println(iterator.getCurrentObj());// 获取当前对象
			iterator.next();// 将游标向下移
		}

	}
}
