/**
 * 
 */
package com.northsunstrider.exception;

import java.util.Random;

import com.northsunstrider.eclipse.codetemplate.TestEntity;

/**
 * @author North
 * @date 2016年1月28日 下午3:22:52
 * @version V1.0
 */
public class ExceptionTest {

    public static void main(String[] args) {
        // test();
        // testFinnally();
        // testFor();
        // testRandom();
        // testNull();
        // testThrows();
        basicValue();
    }

    public static void test() throws IllegalArgumentException {
        throw new IllegalArgumentException();
    }

    public static void testNull() {
        // throw new NullPointerException();
        TestEntity testEntity = null;
        System.out.println(testEntity.getName());
    }

    public static void testThrows() throws ArithmeticException {

    }

    public static void testFinnally() {

        try {
            int a = 4 / 0;
        } finally {
            System.out.println("fianlly");
        }
        System.out.println("out of try catch");
    }

    public static void testRandom() {
        Math.random();
        Random random = new Random();
        int[] a = new int[10];
        random.nextInt(100);
        for (int i = 0; i < 100000; i++) {
            int x = random.nextInt(10);
            a[x] += 1;
        }
        for (int y : a) {
            System.out.println(y);
        }
    }

    public static void testFor() {

        for (;;)
            System.out.println("hhhh");
    }

    public static void basicValue() {
        byte b = 127;
        char a = 'a';
        char d = '中';
        String e = "中国";
        System.out.println(b);
        short x = 1;
        short y = 1;
        short z = (short)(x + y);
        int i = 31231412;
        b = (byte)i;
        System.out.println(b);
    }
}
