package com.northsunstrider.java16;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * @author North
 * @date 2022/09/03
 */
public class EnhencedInstanceOf {

    @Test
    public void testEnhencedInstanceOf() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "java");
        map.put("age", 17);

        // 使用Lambda表达式遍历map
        map.forEach((key, value) -> {
            Object obj = map.get(key);

            // 老版本类型转换实现，需要先判断类型，再手动强转
            if (obj instanceof String) {
                String s = (String)obj;
                System.out.println(s);
            } else {
                System.out.println("不是String，不进行转换");
            }

            // java16 新特性，在判断的时候，如果类型匹配，自动完成类型转换
            if (obj instanceof String s) {
                System.out.println(s);
            } else {
                System.out.println("不是String，不进行转换");
            }
        });

    }

}
