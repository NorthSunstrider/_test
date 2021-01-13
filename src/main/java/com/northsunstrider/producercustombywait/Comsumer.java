package com.northsunstrider.producercustombywait;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年4月25日 上午11:05:08
 */
public class Comsumer extends Thread {
	private String cousumer;
	private Storage storage;

	public Comsumer(Storage storage) {
		super();
		this.storage = storage;
	}

	@Override
	public void run() {
		comsume(cousumer);
	}

	public void comsume(String consumer) {
		storage.consume(consumer);
	}

	public String getCousumer() {
		return cousumer;
	}

	public void setCousumer(String cousumer) {
		this.cousumer = cousumer;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

}
