package com.northsunstrider.providerandconsumer;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月10日 下午3:24:00
 */
public class Provider extends Thread {
	private Container container;

	public Provider(Container container) {
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
				Thread.sleep((long) (Math.random() * 10000 ));
				if (container.getNumbs().size() < 10) {
					container.getNumbs().add((int) (Math.random() * 100));
					System.out.println(this.getName() + "生成了一个数字，当前总量为" + container.getNumbs().size());
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
