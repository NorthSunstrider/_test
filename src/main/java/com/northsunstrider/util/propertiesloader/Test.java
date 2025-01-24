package com.northsunstrider.util.propertiesloader;

import cn.hutool.setting.Setting;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年8月18日 下午7:06:26
 */
public class Test {

    /**
     * @Description TODO
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(MyConfig.NAME + MyConfig.AGE);
    }

    // 使用Hutool读取配置
    public static void getPropertiesByHutool() {
        Setting setting = new Setting("MyConfig.properties");
        System.out.println(setting.getStr("name"));
        System.out.println(setting.getInt("age"));
    }
}
