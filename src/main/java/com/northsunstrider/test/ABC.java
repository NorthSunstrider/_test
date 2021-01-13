package com.northsunstrider.test;

 /** 
 * @Description: TODO
 * @author: North
 * @date: 2018年5月31日 下午5:50:16  
 */
public class ABC {
	private int a;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		ABC abc=new ABC();
		System.out.println(abc.getA());
	}
	
	protected void protect(){
		System.out.println("protect");
	}
	
}
