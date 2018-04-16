package com.northsunstrider.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class DoubleCoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int size=sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine();
		String[] s=str.split(" ");
		ArrayList array=new ArrayList<Integer>();
		for(int i =0;i<size;i++)
			array.add(Integer.valueOf(s[i]));
		System.out.println(getTime(size, array));
	}
	
	public static int getLeastTime(int size,ArrayList<Integer> array){
		Collections.sort(array);
		Integer total=0;
		while(!array.isEmpty()){
			total+=array.get(0);
			
			
		}
		return 0;
	}
	
	public static int getTime(int size,ArrayList<Integer> array){
		Collections.sort(array);
		Collections.reverse(array);
		int core1=array.get(0);
		int core2=array.get(1);
		for(int i=2;i<array.size();i++){
			System.out.println("core1:"+core1/1024);
			System.out.println("core2:"+core2/1024);
			if(core1>core2){
				core2+=array.get(i);
			}else
				core1+=array.get(i);
	
		}	
		
		return core1>=core2?core1:core2;
	}

}
