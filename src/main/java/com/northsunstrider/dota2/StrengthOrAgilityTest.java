package com.northsunstrider.dota2;

public class StrengthOrAgilityTest {

	public static void main(String[] args) {
		Unit dummy=new Unit("dummy", 0, 0, 0, 1000, 0);
		Unit lycn_strength=new Unit("lycn", 110, 0, 175, 1000, 0);
		Unit lycn_agility=new Unit("lycn", 100, 0, 185, 1000, 0);
		
		double d1=attackTimeCalculator(dummy, lycn_strength);
		double d2=attackTimeCalculator(dummy, lycn_agility);
		System.out.println(d1+"______"+d2);
	}
	
	public static double damage_reduction(double armor){
		return (0.06*armor)/(1+0.06*armor);
	}
	
	
	
	public static double attack_count(double hp,double armor){
		return hp/(100*(1-((0.06*armor)/(1+0.06*armor))));
	}

	public static double attck_time(double bat,double as){
		return bat/(as*0.01);
	}
	
	public static double attackTimeCalculator(Unit dummy,Unit hero){
		int hp=dummy.getHealth();
		double armor=dummy.getArmor();
		double attack=hero.getAttack();
		double attack_speed=hero.getAttackSpeed(); 
		double attack_time=attck_time(1.7, attack_speed);
		// attack_time*time*attck=hp
		double count=hp/(attack*attack_time);
		return count;
	}
}
