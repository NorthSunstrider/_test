package com.northsunstrider.dota2;

public class Dota2ArmorTest {

	public static void main(String[] args) {
		//test dota2 armor
		double target_hp=10000;
		double target_armor=0;
		double attack=100;
		for(;target_armor<50;target_armor++){
			System.out.print(target_armor+"\t"+damage_reduction(target_armor)+"\t"+attack_count(target_hp, target_armor));
			System.out.println();
		}
		
	}

	public static double damage_reduction(double armor){
		return (0.06*armor)/(1+0.06*armor);
	}
	
	
	
	public static double attack_count(double hp,double armor){
		return hp/(100*(1-((0.06*armor)/(1+0.06*armor))));
	}
}
