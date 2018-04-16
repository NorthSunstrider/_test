package com.northsunstrider.creatormode1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Provider provider = new MailSenderFactory();
		Sender sender = provider.produce();
		sender.send();
	}

}
