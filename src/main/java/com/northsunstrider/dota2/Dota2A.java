package com.northsunstrider.dota2;

import java.util.Random;

public class Dota2A {

	public static Random random = new Random();

	public static void main(String[] args) {
		methodA();
		String s="208168199381979984699478633344862770286522453884530548425639456820927419612738015378525648451698519643907259916015628128546089888314427129715319317557736620397247064840935";
		System.out.println(s.length());
		String s1="200";
		System.out.println(s1.length());
		
	}

	public static void methodA() {
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < 10; j++) {
				if (randomAttack())
					count++;

			}
			System.out.println(i + ":" + count);

		}

	}

	public static boolean randomAttack() {
		int attack = random.nextInt(10);
		if (attack > 7)
			return true;
		else
			return false;
	}
	
	
}
