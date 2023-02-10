package com.northsunstrider.java17;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * @author North
 * @date 2022/09/03 测试JAVA17新特性 switch 模式匹配，未成功
 */
public class PatternMathchingForSwitch {
    Map<String, Object> map = new HashMap<>();
    {
        map.put("name", "java");
        map.put("age", 17);
        map.put("temperature", 31.5d);
        map.put("score", List.of(12, 12));
    }

    @Test
    public void testSwitch() {

        // 使用Lambda表达式遍历map
        map.forEach((key, value) -> {
            Object obj = map.get(key);

            // 老版本类型转换实现，需要先判断类型，再手动强转
            if (obj instanceof String) {
                String s = (String)obj;
                System.out.println(s);
            } else if (obj instanceof Integer) {
                Integer s = (Integer)obj;
                System.out.println(s);
            } else if (obj instanceof Double) {
                Double s = (Double)obj;
                System.out.println(s);
            } else {
                System.out.println("未找到匹配类型");
            }

            // java16 新特性，在判断的时候，如果类型匹配，自动完成类型转换
            if (obj instanceof String s) {
                System.out.println(s);
            } else if (obj instanceof Integer s) {
                System.out.println(s);
            } else if (obj instanceof Double s) {
                System.out.println(s);
            } else {
                System.out.println("未找到匹配类型");
            }
        });
    }

    @Test
    public void testPatternMathchingForSwitch() {

        // 出错了，IDE提示Cannot switch on a value of type Object.
        // IDE不支持在switch中使用object，搜索了一下相关问题，需要在IDE中将Enable preview features开启
        // 可是IDE中该功能灰了，根本不能选择
        // 倒是在IDEA中，写完下面的代码，自动提示你开启预览功能支持，点一下确认就好了，想返回去找设置项在哪都没找到
        // 有谷歌了下，原来设置在项目结构 项目 语言级别里
        // jdk换成18，再打开支持预览功能又可以编译了
        // 但是使用jdk18，控制台的中文又乱码了，因为18默认指定utf-8为默认字符集，不纠结了，测完这个功能就转回jdk17

        // map.forEach((key, value) -> {
        // Object obj = map.get(key);
        // switch (obj) {
        // case String s -> System.out.println(s);
        // case Integer s -> System.out.println(s);
        // case Double s -> System.out.println(s);
        // default -> System.out.println("未找到匹配类型");
        // }
        // });
    }

}
