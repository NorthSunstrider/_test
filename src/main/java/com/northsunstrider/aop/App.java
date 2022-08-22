package com.northsunstrider.aop;

/**
 * @author North
 * @date 2022/07/12 这是个演示类
 */
public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Hello hello=new Hello();
        Hello hello = AOP.get(Hello.class);
        AOP.invoke(new HelloInteceptor(), () -> {
            hello.test();
        });
    }

}
