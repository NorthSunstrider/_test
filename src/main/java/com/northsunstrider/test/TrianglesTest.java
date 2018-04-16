package com.northsunstrider.test;

public class TrianglesTest {

	public static void main(String[] args) {
		getTriangles();
		int a []={1,234,5};
		int k=0;
		for(int i:a){
			k++;
		}
		System.out.println(k);
		
	}
	
	public static void getTriangles(){
		for(int i=1;i<=10;i++){
			for(int j=1;j<=10;j++){
				for(int k=1;k<=10;k++){
					if(i*i+j*j==k*k&&i+j+k==24&&i<=j&&j<=k)
					System.out.println("i:"+i+"  j:"+j+"  k:"+k);
				}
				
			}
			
		}
		
		
	}

}
