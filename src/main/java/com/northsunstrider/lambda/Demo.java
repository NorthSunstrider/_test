/**
 * 
 */
package com.northsunstrider.lambda;

/** 
 * @author North 
 * @date 2016年1月29日 下午6:30:47 
 * @version V1.0
 */
public class Demo {
	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				for (int i = 1; i <= 100; i++) {
					System.out.print(i + " ");
				}
			}
		};
		t.start();
		for (int i = 65; i < 100; i++)
			System.out.println((char) i);
	}
}
