package com.northsunstrider.java8;

/**
 * 把方法传过去，解耦
 * 
 * @author North
 * @date 2022/09/26
 */
public class A2 extends A1 {
    public void execution() {
        System.out.println("开始执行");
        String value = "hugo";
        idempotentMessageBody(value, () -> printString(value));
    }

    public boolean printString(String aaa) {
        System.out.println("printString方法开始执行" + aaa);
        return true;
    }

    // 测试类,可以debug下看下执行流程
    public static void main(String[] args) {
        A2 a2 = new A2();
        a2.execution();
    }

}
