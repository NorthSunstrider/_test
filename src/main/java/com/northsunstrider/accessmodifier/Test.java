package com.northsunstrider.accessmodifier;

/**
 * @author North
 * @date 2021/02/22
 */
public class Test {

    public static void main(String[] args) {
        methodClassTest();
    }

    public static void methodClassTest() {
        MethodClass.publicStaticMethod();
        MethodClass.protectedStaticMethod();
        MethodClass.defaultStaticMethod();
        MethodClass mc = new MethodClass();
        mc.publicMethod();
        mc.protectedMethod();
        mc.defaultMethod();
    }
}
