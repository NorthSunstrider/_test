package com.northsunstrider.wow;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Description: 模拟猫德的输出循环
 * @author: North
 * @date: 2018年4月19日 下午4:11:14
 */
public class DruidTest {
	public static void main(String[] args) {
		damageCycle();
	}

	public static void damageCycle() {
		List<Character> skillList = new ArrayList<Character>();
		int count = 0;
		int timer = 0;

		System.out.print('a');
		skillList.add('a');
		count++;

		Random random = new Random();

		for (;;) {
			timer++;
			if (timer % 16 == 0 && count >= 5)
				break;
			if (timer % 16 == 0) {
				skillList.add('a');
				count++;
				System.out.print('a');
				continue;
			}
			if (count < 5) {
				skillList.add('b');
				count++;
				if (random.nextBoolean())
					count++;
				System.out.print('b');
				continue;
			}
			if (count >= 5) {
				skillList.add('c');
				count = 0;
				System.out.print('c');
				System.out.println();
				continue;
			}
		}

	}
}
