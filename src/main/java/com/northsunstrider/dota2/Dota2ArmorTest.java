package com.northsunstrider.dota2;

/**
 * @Description: Dota2 护甲计算
 * @author: North
 * @date: 2018年5月1日 下午10:25:08
 */
public class Dota2ArmorTest {

	public static void main(String[] args) {
		// armor2evade();
		loopArmorIncrease();
	}

	/**
	 * @Description 计算护甲减免
	 * @param armor
	 * @return
	 */
	public static double damage_reduction(double armor) {
		return (0.06 * armor) / (1 + 0.06 * armor);
	}

	/**
	 * @Description 传入血量、护甲、攻击，计算击杀所需攻击次数
	 * @param hp
	 * @param armor
	 * @param attack
	 * @return
	 */
	public static double attack_count(double hp, double armor, double attack) {
		return hp / (attack * (1 - ((0.06 * armor) / (1 + 0.06 * armor))));
	}

	/**
	 * @Description 循环增加护甲，测试护甲递增情况下，抗打击能力
	 */
	public static void loopArmorIncrease() {
		double target_hp = 10000;
		double target_armor = 0;
		double attack = 200;
		for (; target_armor < 50; target_armor++) {
			System.out.print(target_armor + "\t" + damage_reduction(target_armor) + "\t"
					+ attack_count(target_hp, target_armor, attack));
			System.out.println();
		}
	}

	/**
	 * @Description 增加护甲，转化为闪避 护甲越高，继续提升护甲，转变的闪避率就越低
	 */
	public static void armor2evade() {
		double target_hp = 2000;
		double target_armor = 0;
		double attack = 200;
		// 2000血0甲单位，承受200攻击
		// 需10次
		System.out.println(attack_count(target_hp, target_armor, attack));

		target_armor = 10;
		// 2000血10甲单位，承受200攻击
		// 需16次
		// 相比于0甲，相当于提升了6/16=37.5%的闪避
		System.out.println(attack_count(target_hp, target_armor, attack));

		target_armor = 20;
		// 2000血20甲单位，承受200攻击
		// 需22次
		// 相比于10甲，相当于提升了6/22=27.2%的闪避
		System.out.println(attack_count(target_hp, target_armor, attack));

	}
}
