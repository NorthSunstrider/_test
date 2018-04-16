package com.northsunstrider.sgs;

public class Skill {

	private SgsPhase phase;
	private String description;

	public Skill() {
		super();
	}

	public Skill(SgsPhase phase, String description) {
		super();
		this.phase = phase;
		this.description = description;
	}

	public SgsPhase getPhase() {
		return phase;
	}

	public void setPhase(SgsPhase phase) {
		this.phase = phase;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
