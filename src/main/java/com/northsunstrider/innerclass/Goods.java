package com.northsunstrider.innerclass;

public class Goods {

	private class Content implements Contents{
		private int i=11;
		@Override
		public int value() {
			return i;
		}
	}
	
	protected class GDestionation implements Destionation{
		private String label;
		private GDestionation(String whereTo){
			label = whereTo;
		}
		@Override
		public String readLabel() {
			return label;
		}
	}
	
	public Destionation dest(String s){
		return new GDestionation(s);
	}
	
	public Contents cont(){
		return new Content();
	}
}
