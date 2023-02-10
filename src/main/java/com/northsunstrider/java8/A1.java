package com.northsunstrider.java8;

import java.util.function.Supplier;

/**
 * @author North
 * @date 2022/09/26
 */
public abstract class A1 {

    protected void idempotentMessageBody(String msgKey, Supplier<Boolean> supplier) {
        // 对消息体进行md5加密做为key, 放入redis, 有效时间暂定60s, 重复消息抛弃并告警
        System.out.println("获得锁" + msgKey);

        // 开始执行A2的printString()方法, 就可以在前后进行一些修饰
        supplier.get();

        System.out.println("释放锁");
    }

}
