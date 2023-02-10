/**
 * 
 */
package com.northsunstrider.java8.lambda;

import java.io.File;

import javax.swing.filechooser.FileFilter;

/** 
 * @author North 
 * @date 2016年1月29日 下午6:00:09 
 * @version V1.0
 */
public class Test1 {

	/** 
	* @Description: TODO 
	* @param @param args  
	* @return void   
	* @throws 
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void test1() {
		File dir = new File("/an/dir");

		FileFilter directoryFilter = new FileFilter() {

			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean accept(File f) {
				// TODO Auto-generated method stub
				return f.isDirectory();
			}
		};

	}

	public static void test2() {
		File dir = new File("/an/dir/");
		// FileFilter directoryFilter = (File f) -> f.isDirectory();
		// File[] dirs = dir.listFiles(directoryFilter);
	}

	public static void test3() {
		File dir = new File("/an/dir/");
		File[] dirs = dir.listFiles((File f) -> f.isDirectory());
	}

	public static void test4() {

		// FileFilter java = (File f) -> f.getName().endsWith("*.java");
		// String user = doPrivileged(() -> System.getProperty("user.name"));
	}

	public static String test5() {

		// return () -> ("hello");
		return null;
	}

}
