package com.northsunstrider.sgs;

public class Test {

	public static void main(String[] args) {
		Skill longdan = new Skill(SgsPhase.chupai, "龙胆：杀当闪，闪当杀。");
		Skill[] skills = { longdan };
		Hero Zhaoyun = new Hero("赵云", Force.shuguo, 4, skills);
	}
}
