package com.northsunstrider.radixparser;

/** 
 * @author North 
 * @date 2016年2月1日 上午11:35:53 
 * @version V1.0
 */
public class IntegerParser {

	private static int REDIX = 13;

	public static int parse(String s) {
		int number = 0;
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			int aInt = (int) a;
			if ((int) a >= 65 && (int) a <= 90) {
				double x = Math.pow(REDIX, s.length() - i - 1);
				number += (x * (aInt - 54));
			}
			if ((int) a >= 48 && (int) a <= 57) {
				double x = Math.pow(REDIX, s.length() - i - 1);
				number += (x * (aInt - 48));
			}
		}

		return number;
	}

	public static void main(String[] args) {
		String value = "11";
		int a = parse(value);
		System.out.println(a);
	}
}
