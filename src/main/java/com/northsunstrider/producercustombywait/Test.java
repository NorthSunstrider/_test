package com.northsunstrider.producercustombywait;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年4月25日 上午11:07:32
 */
public class Test {

	/**
	 * @Description TODO
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Storage storage = new Storage();

		Producer producer1 = new Producer(storage);
		producer1.setProducer("1");
		producer1.start();
		Producer producer2 = new Producer(storage);
		producer2.setProducer("2");
		producer2.start();
		Producer producer3 = new Producer(storage);
		producer3.setProducer("3");
		producer3.start();
		Producer producer4 = new Producer(storage);
		producer4.setProducer("4");
		producer4.start();
		Producer producer5 = new Producer(storage);
		producer5.setProducer("5");
		producer5.start();

		Comsumer comsumer1 = new Comsumer(storage);
		comsumer1.setCousumer("1");
		comsumer1.start();
		Comsumer comsumer2 = new Comsumer(storage);
		comsumer2.setCousumer("2");
		comsumer2.start();
		Comsumer comsumer3 = new Comsumer(storage);
		comsumer3.setCousumer("3");
		comsumer3.start();
	}

}
