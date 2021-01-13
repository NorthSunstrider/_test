package com.northsunstrider.providerandconsumer;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月10日 下午5:21:17
 */
public class Consumer extends Thread {
	private Container container;

	public Consumer(Container container) {
		super();
		this.container = container;
	}

	public Container getContainer() {
		return container;
	}

	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep((long) (Math.random() * 10000));
				if (container.getNumbs().size() > 0) {
					container.getNumbs().remove(0);
					System.out.println(this.getName() + "消耗了一个数字，当前总量为" + container.getNumbs().size());
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
