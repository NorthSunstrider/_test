package com.northsunstrider.innerclass;

public class Human implements Eat{

	class AAA implements Drink{
		
		@Override
		public void drink() {
			//
			System.out.println("喝水");
			this.drink();
		}

	}
	
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃饭");
	}

	class Xin{
		int temp=36;
	}
	
	public void drink(){
		
		System.out.println("human drink");
	}
	
	public static void main(String[] args) {
		new Thread(){

			
		};
	}
	
}

