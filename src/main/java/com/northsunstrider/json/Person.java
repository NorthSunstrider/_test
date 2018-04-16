package com.northsunstrider.json;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Person {
	private String idNumber;

	public Person() {
		super();
	}

	public Person(String idNumber) {
		super();
		this.idNumber = idNumber;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	@JsonIgnore
	public String getAAA() {
		return idNumber;
	}
	
	public void getInstance(){
	}

}
