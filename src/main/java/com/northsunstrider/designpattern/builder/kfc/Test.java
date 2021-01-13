package com.northsunstrider.designpattern.builder.kfc;

 /** 
 * @Description: TODO
 * @author: North
 * @date: 2018年5月23日 下午6:44:37  
 */
public class Test {

	/**
	 * @Description TODO
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Item item=new Item(new Pepsi(), new MeatHamburger());
		item.getCola().pack();
		
		
		ItemType aaa=ItemType.BAISHITAOCAN1;
		MeatHamburger hamburger=(MeatHamburger) aaa.getHamburger();
		System.out.println(hamburger.getName());
		System.out.println(aaa.getHamburger().getClass());
		
		Class clz=aaa.getHamburger().getClass();
		clz.newInstance();
	}

}
