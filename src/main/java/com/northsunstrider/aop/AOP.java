package com.northsunstrider.aop;

/**
 * @author North
 * @date 2022/07/12
 */
public class AOP {
    // 根据传入的class对对象进行实例化，相当于spring的ioc功能
    public static <T> T get(Class<T> clazz) {
        try {
            return clazz.getConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("获取实例化对象失败");
        }
    }

    public static void invoke(Inteceptor interceptor, Invoke invoke) {
        interceptor.invoke(invoke);
    }

}
