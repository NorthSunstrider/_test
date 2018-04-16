package com.northsunstrider.creatormode;

public class SenderFactory {

	public MailSender produceMailSender() {
		return new MailSender();
	}

	public SmsSender produceSmsSender() {
		return new SmsSender();
	}
}
