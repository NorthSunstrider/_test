/**
 * 
 */
package com.northsunstrider.exception;

/** 
 * @author North 
 * @date 2016年1月28日 下午7:53:48 
 * @version V1.0
 */
public class ExceptionTest4 {

	public void method(String str) throws MyException, MyException2 {
		if (null == str) {
			throw new MyException("传入的字符串参数不能为null！");
		} else if ("hello".equals(str)) {
			throw new MyException2("传入的字符串不能为hello");
		} else {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		// 异常处理方式2，采用try...catch语句
		try {
			ExceptionTest4 test = new ExceptionTest4();
			test.method(null);

		} catch (MyException e) {
			System.out.println("进入到MyException catch块");
			e.printStackTrace();
		} catch (MyException2 e) {
			System.out.println("进入到MyException2 catch块");
			e.printStackTrace();
		} finally {
			System.out.println("程序处理完毕");
		}

	}
}

class MyException extends Exception {

	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message);
	}
}

class MyException2 extends Exception {
	public MyException2() {
		super();
	}

	public MyException2(String message) {
		super(message);
	}

}
