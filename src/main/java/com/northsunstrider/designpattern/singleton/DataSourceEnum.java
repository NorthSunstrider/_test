package com.northsunstrider.designpattern.singleton;

/**
 * @Description: 用枚举实现的单例模式
 * @author: North
 * @date: 2018年5月23日 下午1:03:17
 */
public enum DataSourceEnum {
	DATASOURCE;
	private DBConnection dbConnection = null;

	private DataSourceEnum() {
		this.dbConnection = new DBConnection();
	}

	public DBConnection getInstance() {
		return dbConnection;
	}
}

class DBConnection {

}