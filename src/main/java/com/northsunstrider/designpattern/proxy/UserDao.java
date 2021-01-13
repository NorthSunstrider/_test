package com.northsunstrider.designpattern.proxy;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月24日 下午8:15:58
 */
public class UserDao implements IUserDao {

	@Override
	public void save() {
		System.out.println("保存数据");
	}

}
