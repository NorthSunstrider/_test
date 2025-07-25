package com.northsunstrider.java8.functionalInterface;

import com.northsunstrider.clz.Run;

public class Test {
    public static void main(String[] args) {
        Inter i = () -> System.out.println("Hello World");
        i.show();

        Run r=()-> System.out.println("aaaa");
        r.run();
    }
}
