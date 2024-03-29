package com.northsunstrider.designpattern.producerconsumer.version2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年4月25日 下午12:59:28
 */
public class Test {
	/**
	 * @Description TODO
	 */
	public static void main(String[] args) {
		List<PCData> queue = new ArrayList<PCData>();
		int length = 10;
		Producer p1 = new Producer(queue, length);
		Producer p2 = new Producer(queue, length);
		Producer p3 = new Producer(queue, length);
		Consumer c1 = new Consumer(queue);
		Consumer c2 = new Consumer(queue);
		Consumer c3 = new Consumer(queue);
		ExecutorService service = Executors.newCachedThreadPool();
		service.execute(p1);
		service.execute(p2);
		service.execute(p3);
		service.execute(c1);
		service.execute(c2);
		service.execute(c3);
	}
}
