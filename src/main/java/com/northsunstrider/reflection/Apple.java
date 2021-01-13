package com.northsunstrider.reflection;

 /** 
 * @Description: TODO
 * @author: North
 * @date: 2018年10月29日 上午7:19:54  
 */
public class Apple {
	 private String name;
	    private int age;

	    private Apple(int age){
	        this.age = age;
	    }

	    private void speak(String name){
	        System.out.println("我的名字是:"+name);
	    }

	    public Apple(String name) {
	        this.name = name;
	    }
}
