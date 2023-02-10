package com.northsunstrider.methodtransmit;

// 测试基本类型的值在方法中的传递
public class BasicTypeMethodTransmitTest {

    public static void main(String[] args) {
        intTransmitTest();
        byteTransmitTest();
    }

    public static void intTransmit(int value) {
        value = ++value;
    }

    public static void intTransmitTest() {
        int i = 1;
        intTransmit(i);
        System.out.println(i);
    }

    public static void byteTransmit(byte value) {
        value = ++value;
    }

    public static void byteTransmitTest() {
        byte b = 1;
        byteTransmit(b);
        System.out.println(b);
    }
}
