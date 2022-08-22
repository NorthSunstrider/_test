package com.northsunstrider.aop;

/**
 * @author North
 * @date 2022/07/12 使用方法也非常的简单，只需要调用invoke就可以执行匿名方法了。 可以定义执行方法前后的操作，异常处理只需用try catch即可，也可自定义异常类型。
 * 
 * 
 */
public class HelloInteceptor implements Inteceptor {

    /* (non-Javadoc)
     * @see com.northsunstrider.aop.Inteceptor#invoke(com.northsunstrider.aop.Invoke)
     */
    @Override
    public void invoke(Invoke invoke) {
        // TODO Auto-generated method stub
        System.out.println("执行前");
        try {
            invoke.invoke();
        } catch (Exception e) {
            System.out.println("假如出现错误");
        }
        System.out.println("执行后");
    }
}