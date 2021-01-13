package com.northsunstrider.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年6月1日 下午9:01:38
 */
public class FindJob {

	/**
	 * @Description TODO
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, M;
		long Di, Pi;
		List<Long> Dis = new ArrayList<>(), Pis = new ArrayList<>();
		long Ai;
		List<Long> Ais = new ArrayList<>();

		N = sc.nextInt();
		M = sc.nextInt();
		while (N > 0) {
			Di = sc.nextLong();
			Dis.add(Di);
			Pi = sc.nextLong();
			Pis.add(Pi);
			N--;
		}
		while (M > 0) {
			Ai = sc.nextLong();
			Ais.add(Ai);
			M--;
		}

		for (int i = 0; i < Ais.size(); i++) {
			long temp = 0;
			for (int j = 0; j < Dis.size(); j++) {
				if (Ais.get(i) >= Dis.get(j) && Pis.get(j) > temp) {
					temp = Pis.get(j);
				}
			}
			System.out.println(temp);
		}
		
		sc.close();

	}

}
