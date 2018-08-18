package com.northsunstrider.util.propertiesloader.owner;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

/**
 * @Description: 使用owner包管理属性配置文件
 * @author: North
 * @date: 2018年8月18日 下午6:32:36
 */
// 指定扫描路径，默认为扫描当前文件夹
@Sources("classpath:MyConfig.properties")
public interface MyConfig extends Config {

	String name();

	int age();
}
