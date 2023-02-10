package com.northsunstrider.java14;

import org.junit.Test;

/**
 * @author North
 * @date 2022/09/03
 */
public class EnhancedSwitch {

    // 在Java 14的switch表达式增强中，引入了对Lambda语法的支持，让每个case分支变得更为简洁。同时，容易遗忘的break也可以省略了。
    @Test
    public void testEnhancedSwitch() {
        int index = 0;
        switch (index) {
            case 0 -> System.out.println("zero");
            case 1 -> System.out.println("first");
            default -> throw new IllegalArgumentException("Unexpected value: " + index);
        }
    }

}
