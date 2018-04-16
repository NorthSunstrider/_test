/**
 * 
 */
package com.northsunstrider.json;

/** 
 * @author North 
 * @date 2016年1月20日 上午11:10:22 
 * @version V1.0
 */
public class Animal {
	private String name;
	private Corlor corlor;

	/**
	 * Constructor
	 */
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * Constructor
	 * @param name
	 * @param corlor
	 */
	public Animal(String name, Corlor corlor) {
		super();
		this.name = name;
		this.corlor = corlor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Corlor getCorlor() {
		return corlor;
	}

	public void setCorlor(Corlor corlor) {
		this.corlor = corlor;
	}

}
