package com.northsunstrider.creatormode;

public class Test {

	public static void main(String[] args) {
		createSend();
	}

	// 使用工厂模式创建实例的正确演示
	public static void createSend() {
		SenderFactory senderFactory = new SenderFactory();
		Send send = senderFactory.produceMailSender();
		send.send();
	}

	// 使用工厂模式创建实例的错误演示
	// new一个MailSender，而不是new一个Send，已经违反了设计原则
	public static void createSender() {
		SenderFactory senderFactory = new SenderFactory();
		MailSender mailSender = senderFactory.produceMailSender();
		mailSender.send();
	}
}
