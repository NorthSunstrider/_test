package com.northsunstrider.dota2;

public class Unit {
	private String name;
	private double attack;
	private double armor;
	private double attackSpeed;
	private int health;
	private int mana;

	public Unit() {
		super();
	}

	public Unit(String name, double attack, double armor, double attackSpeed, int health, int mana) {
		super();
		this.name = name;
		this.attack = attack;
		this.armor = armor;
		this.attackSpeed = attackSpeed;
		this.health = health;
		this.mana = mana;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAttack() {
		return attack;
	}

	public void setAttack(double attack) {
		this.attack = attack;
	}

	public double getArmor() {
		return armor;
	}

	public void setArmor(double armor) {
		this.armor = armor;
	}

	public double getAttackSpeed() {
		return attackSpeed;
	}

	public void setAttackSpeed(double attackSpeed) {
		this.attackSpeed = attackSpeed;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

}
