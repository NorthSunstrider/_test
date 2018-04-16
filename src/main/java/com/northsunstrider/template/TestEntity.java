/**
 * 
 */
package com.northsunstrider.template;

/**
 * @author North
 * @date 2016年1月19日 下午3:58:22
 * @version V1.0
 */
public class TestEntity {

	private String name;
	private String password;

	/**
	 * Constructor
	 */
	public TestEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param password
	 */
	public TestEntity(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
