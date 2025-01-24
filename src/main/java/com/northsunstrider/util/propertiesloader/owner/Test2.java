package com.northsunstrider.util.propertiesloader.owner;

import cn.hutool.setting.Setting;

/**
 * 使用Hutool读取配置
 * 
 * @author North
 * @date 2025/01/24
 */
public class Test2 {

    public static void main(String[] args) {
        getProperties();
    }

    public static void getProperties() {
        Setting setting = new Setting("MyConfig.properties");
        System.out.println(setting.getStr("name"));
        System.out.println(setting.getInt("age"));
    }

}
