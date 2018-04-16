package com.northsunstrider.sort;

import java.util.Random;

public class SortTest {

	public static void main(String[] args) {
		int[] numbers = RandonArray(10, 100);
		for (int i : numbers)
			System.out.print(i + "\t");
		System.out.println();
		QuickSort.sort(numbers,0,9);
		for (int i : numbers)
			System.out.print(i + "\t");
	}
	
	public static int[] RandonArray(int size, int range) {
		int[] array = new int[size];
		Random random = new Random();
		for (int i = 0; i < size; i++)
			array[i] = random.nextInt(range);
		return array;
	}

}
