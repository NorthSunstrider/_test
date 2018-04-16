package com.northsunstrider.algorithm;

import java.util.Random;

/*	生成符合正态分布的随机数
 * 	正态分布又名高斯分布
 */
public class Gaussian {

	public static void main(String[] args) {
		randomNextGaussian();
	}

	public double Norm_rand(double miu, double sigma2) {
		double N = 12;
		double x = 0, temp = N;
		do {
			x = 0;
			for (int i = 0; i < N; i++)
				x = x + (Math.random());
			x = (x - temp / 2) / (Math.sqrt(temp / 12));
			x = miu + x * Math.sqrt(sigma2);
		} while (x <= 0); // 在此我把小于0的数排除掉了
		return x;
	}

	public static void randomNextGaussian() {
		Random random = new Random();
		int i = 0;
		while (i < 10) {
			double n = random.nextGaussian();
			System.out.println(n);
			i++;
		}
	}
}
