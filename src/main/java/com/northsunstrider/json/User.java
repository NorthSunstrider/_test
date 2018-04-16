package com.northsunstrider.json;

import java.util.List;

public class User {

	private String username;
	private String password;
	private List<BankCardInfo> bankCardInfos;

	public User() {
		super();
	}

	public User(String username, String password, List<BankCardInfo> bankCardInfos) {
		super();
		this.username = username;
		this.password = password;
		this.bankCardInfos = bankCardInfos;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<BankCardInfo> getBankCardInfos() {
		return bankCardInfos;
	}

	public void setBankCardInfos(List<BankCardInfo> bankCardInfos) {
		this.bankCardInfos = bankCardInfos;
	}

}
