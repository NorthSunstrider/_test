package com.northsunstrider.info;

import java.lang.annotation.Annotation;

public class Client {
	public static void main(String[] args) {
		InnerClassA a= new InnerClassA();
		a.test();
		
		String pkcName = "com.northsunstrider.info";
		Package pkg = Package.getPackage(pkcName);
		Annotation[] annotations = pkg.getAnnotations();
		for(Annotation an:annotations){
			if(an instanceof PkgAnnotation){
				System.out.println("Hi"+an);
				
			}
			
		}
	}
}
