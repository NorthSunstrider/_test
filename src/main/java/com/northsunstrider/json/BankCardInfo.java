package com.northsunstrider.json;

public class BankCardInfo {
	private String bankCardNum;
	private String bankCardName;

	public BankCardInfo() {
		super();
	}

	public BankCardInfo(String bankCardNum, String bankCardName) {
		super();
		this.bankCardNum = bankCardNum;
		this.bankCardName = bankCardName;
	}

	public String getBankCardNum() {
		return bankCardNum;
	}

	public void setBankCardNum(String bankCardNum) {
		this.bankCardNum = bankCardNum;
	}

	public String getBankCardName() {
		return bankCardName;
	}

	public void setBankCardName(String bankCardName) {
		this.bankCardName = bankCardName;
	}

}
