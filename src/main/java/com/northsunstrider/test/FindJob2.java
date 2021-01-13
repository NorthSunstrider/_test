package com.northsunstrider.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年6月1日 下午9:01:38
 */
public class FindJob2 {

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
		List<Job> jobs = new ArrayList<>();

		N = sc.nextInt();
		M = sc.nextInt();
		while (N > 0) {
			Di = sc.nextLong();
			Pi = sc.nextLong();
			jobs.add(new Job(Di, Pi));
			N--;
		}
		while (M > 0) {
			Ai = sc.nextLong();
			Ais.add(Ai);
			M--;
		}
		jobs.sort(new Comparator<Job>() {

			@Override
			public int compare(Job o1, Job o2) {
				if (o1.getDi() < o2.getDi())
					return -1;
				if (o1.getDi() == o2.getDi())
					return 0;
				else
					return 1;
			}
		});
		;

		for (int i = 0; i < Ais.size(); i++) {
			long temp = 0;
			for (int j = 0; j < jobs.size(); j++) {
				Job job = jobs.get(j);
				if (Ais.get(i) < job.getDi())
					break;
				if (Ais.get(i) >= job.getDi() && job.getPi() > temp) {
					temp = job.getPi();
				}
			}
			System.out.println(temp);
		}

		sc.close();

	}

}

class Job implements Comparable<Job> {
	long di;
	long pi;

	public Job(long di, long pi) {
		super();
		this.di = di;
		this.pi = pi;
	}

	public long getDi() {
		return di;
	}

	public void setDi(long di) {
		this.di = di;
	}

	public long getPi() {
		return pi;
	}

	public void setPi(long pi) {
		this.pi = pi;
	}

	@Override
	public int compareTo(Job o) {
		if (di < o.getDi())
			return -1;
		if (di == o.getDi())
			return 0;
		else
			return 1;
	}

}
