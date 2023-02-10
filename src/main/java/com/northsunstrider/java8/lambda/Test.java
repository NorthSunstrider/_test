package com.northsunstrider.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Description: lambda
 * @author: North
 * @date: 2018年5月2日 上午8:43:43
 */
public class Test {

    /**
     * @Description main
     * @param args
     */
    public static void main(String[] args) {

        Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 10).stream().reduce(0, Integer::sum);

        Arrays.asList("a", "b", "d").forEach(System.out::println);

        arraysLoopOriginal();

        arraysLoopByLambda();

        arraysLoopByLambda1();

        arraysLoop();
    }

    /**
     * @Description 传统方式的for循环
     */
    public static void arraysLoopOriginal() {
        for (String s : Arrays.asList("a", "b", "d"))
            System.out.println(s);
    }

    /**
     * @Description java8新加lambda表达式实现的for循环
     */
    public static void arraysLoopByLambda() {
        Arrays.asList("a", "b", "d").forEach(e -> System.out.println(e));
    }

    /**
     * @Description lambda表达式的简化版本双冒号表达式
     */
    public static void arraysLoopByLambda1() {
        String[] a = {"17", "52", "33", "412", "59", "62", "71"};
        List<String> list = Arrays.asList(a);
        // 这个是使用lambda表达式的简化版本双冒号表达式（调用out对象的println方法）
        list.forEach(System.out::println);
    }

    /**
     * @Description java8新加的函数list.forEach()
     */
    public static void arraysLoop() {
        Arrays.asList("a", "b", "d").forEach(new Consumer<String>() {
            public void accept(String t) {
                System.out.println(t);
            };
        });
    }

}
