package com.northsunstrider.java8;

import java.util.function.Supplier;

/**
 * @author North
 * @date 2022/09/26
 */
public abstract class A1 {

    protected void idempotentMessageBody(String msgKey, Supplier<Boolean> supplier) {
        // 方法开始
        System.out.println("A1方法开始" + msgKey);

        // 开始执行A2的printString()方法, 就可以在前后进行一些修饰
        supplier.get();

        //执行完传入的函数，继续执行
        System.out.println("A1执行完毕");
    }

}
