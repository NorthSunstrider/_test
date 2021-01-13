package com.northsunstrider.providerandconsumer;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月10日 下午5:25:18
 */
public class Test {

	/**
	 * @Description TODO
	 * @param args
	 */
	public static void main(String[] args) {
		Container container = new Container();

		for (int i = 0; i < 3; i++) {
			Provider provider = new Provider(container);
			provider.setName("provider[" + i + "]");
			provider.start();
		}

		for (int i = 0; i < 2; i++) {
			Consumer consumer = new Consumer(container);
			consumer.setName("consumer[" + i + "]");
			consumer.start();
		}
	}

}
