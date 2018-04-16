package com.northsunstrider.sgs;

public class Hero {

	private String name;
	private Force force;
	private int health;
	private Skill[] skills;

	public Hero() {
		super();
	}

	public Hero(String name, Force force, int health, Skill[] skills) {
		super();
		this.name = name;
		this.force = force;
		this.health = health;
		this.skills = skills;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Force getForce() {
		return force;
	}

	public void setForce(Force force) {
		this.force = force;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public Skill[] getSkills() {
		return skills;
	}

	public void setSkills(Skill[] skills) {
		this.skills = skills;
	}

}
