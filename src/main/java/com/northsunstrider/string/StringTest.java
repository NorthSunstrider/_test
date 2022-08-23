package com.northsunstrider.string;

import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年4月14日 下午3:54:55
 */
public class StringTest {

    /**
     * @Description main方法
     * @param args
     */
    public static void main(String[] args) {
        compareStringTest();
        stringPlusStringBuilderTest();
        int a;
        System.out.println(a = 7);

        String c = "abc";
        String b = "a" + new String("bc");
        System.out.println(c == b);

        chineseWords();
    }

    /**
     * @Description 用==符号比较值相同的String对象
     */
    public static void compareStringTest() {
        String s1 = "abc";
        String s2 = "a" + new String("bc");

        // 运行结果为false
        System.out.println(s1 == s2);
    }

    /**
     * @Description 测试String和StringBuilder是否可以使用符号'+'
     */
    public static void stringPlusStringBuilderTest() {
        String s = "1bc";
        StringBuilder sb = new StringBuilder("aaa");
        // 编译可以通过，String和StringBuilder可以使用符号'+'
        System.out.println(s + sb);
    }

    /**
     * @Description 测试Java中的三个String对象
     */
    public static void threeStringObjectTest() {
        String str = new String("aaa");
        StringBuffer sb = new StringBuffer("sbsb");
        StringBuilder stringBuilder = new StringBuilder("builder");

        char a = 'a';
        // 报错
        // char b="a";
        char c = '他';
    }

    // 中英文字符在内存中的存储方式
    public static void chineseWords() {
        try {
            System.out.println(Charset.defaultCharset());
            String code = "码";
            String c = "0xF0";

            System.out
                .println("UTF-8占用内存大小为:" + code.getBytes("UTF-8").length + Arrays.toString(code.getBytes("UTF-8")));
            System.out.println("GBK占用内存大小为:" + code.getBytes("gbk").length + Arrays.toString(code.getBytes("gbk")));
            System.out
                .println("GB2312占用内存大小为:" + code.getBytes("GB2312").length + Arrays.toString(code.getBytes("GB2312")));
            System.out
                .println("UTF-16占用内存大小为:" + code.getBytes("UTF-16").length + Arrays.toString(code.getBytes("UTF-16")));
            System.out.println("=========================");
            System.out.println("UTF-8占用内存大小为:" + c.getBytes("UTF-8").length + Arrays.toString(c.getBytes("UTF-8")));
            System.out.println("GBK占用内存大小为:" + c.getBytes("gbk").length + Arrays.toString(c.getBytes("gbk")));
            System.out.println("GB2312占用内存大小为:" + c.getBytes("GB2312").length + Arrays.toString(c.getBytes("GB2312")));
            System.out.println("UTF-16占用内存大小为:" + c.getBytes("UTF-16").length + Arrays.toString(c.getBytes("UTF-16")));
        } catch (Exception e) {
        }
    }

}
