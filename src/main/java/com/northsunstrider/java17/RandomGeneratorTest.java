package com.northsunstrider.java17;

import java.util.random.RandomGenerator;

public class RandomGeneratorTest {
    public static void main(String[] args) {
        randomGeneratorWithAlgorithm();
    }

    public static void defaultGenerator() {
        RandomGenerator rg = RandomGenerator.getDefault();
        System.out.println(rg.nextInt());
    }

    public static void randomGeneratorWithAlgorithm() {
        //常见算法：L128X256MixRandom、L128X256MS、L64X128MixRandom、
        //JAVA17之后才添加的算法L64X128MS、Xoroshiro128Plus、Xoshiro256Plus、LFSR113
        RandomGenerator rg = RandomGenerator.of("L64X128MixRandom");
        System.out.println(rg.nextInt(100));
    }

}
