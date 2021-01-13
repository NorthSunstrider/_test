package com.northsunstrider.producercustombywait;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年4月25日 上午11:00:44
 */
public class Producer extends Thread {
	private String producer;
	private Storage storage;

	public Producer(Storage storage) {
		super();
		this.storage = storage;
	}

	@Override
	public void run() {
		produce(producer);
	}

	public void produce(String producer) {
		storage.produce(producer);
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

}
