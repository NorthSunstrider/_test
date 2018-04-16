/**
 * 
 */
package com.northsunstrider.json;

/** 
 * @author North 
 * @date 2016年1月20日 上午11:10:45 
 * @version V1.0
 */
public class Corlor {
	

	private String desc;
	private int rgb;
	
	public static final Corlor BLUE=new Corlor("red", 100);
	/**
	 * Constructor
	 * @param desc
	 * @param rgb
	 */
	
	private Corlor(String desc, int rgb) {
		this.desc = desc;
		this.rgb = rgb;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getRgb() {
		return rgb;
	}

	public void setRgb(int rgb) {
		this.rgb = rgb;
	}
	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
			return "esc:asdfadsf";
	}

}
