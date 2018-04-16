package com.northsunstrider.test;

import java.awt.Button;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.northsunstrider.clz.Constructor;

public class Test {

	public static void main(String[] args) {
		// int[] numbers = RandonArray(10, 100);
		// for (int i : numbers)
		// System.out.print(i + "\t");
		// System.out.println();
		// quickSort(numbers, 0, 9);
		// for (int i : numbers)
		// System.out.print(i + "\t");
		// sortArrayAsRandom();
		classTest();
	}

	public static int[] RandonArray(int size, int range) {
		int[] array = new int[size];
		Random random = new Random();
		for (int i = 0; i < size; i++)
			array[i] = random.nextInt(range);
		return array;
	}

	public static void method1() {
		Constructor c = new Constructor("ss");
		String a = c.name;
	}

	public static void method2() {
		int a[][] = { { 1, 1 }, { 2, 3 } };
		int b[][][] = { { { 1, 1, 1 } }, { { 2, 3, 4 } }, { { 12, 3, 4 } } };
		int c[][][][] = {};
	}

	public static void exchange(int[] array, int x, int y) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}

	public static void bubbleSort(int[] numbers) {
		numbers = new int[] { 6, 3, 23, 6, 7, 67 };
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j + 1];
					numbers[j + 1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		for (int i : numbers)
			System.out.println(i);
	}

	public static void jiweijiuSort(int[] n) {
		int left = 0;
		int right = n.length - 1;
		while (left < right) {
			for (int i = left; i < right; i++) {
				if (n[i] > n[i + 1])
					exchange(n, i, i + 1);
			}
			right--;
			for (int j = right; j > left; j--) {
				if (n[j] < n[j - 1])
					exchange(n, j, j - 1);
			}
			left++;
		}
	}

	public static void insertSort(int[] numbers) {
		for (int i = 1; i < numbers.length; i++) {
			int temp = numbers[i];
			for (int j = i - 1; j >= 0; j--) {
				if (numbers[j] > temp) {
					exchange(numbers, j + 1, j);
					// numbers[j + 1] = numbers[j];
					// count = j;
				} else {
					break;
				}
			}
			// if(count!=0)
			// numbers[count] = temp;
			for (int k : numbers)
				System.out.print(k + "\t");
			System.out.println();
		}
	}

	public static void insertionSort(int[] n) {
		for (int i = 1; i < n.length; i++) {
			int temp = n[i];
			int j = i - 1;
			while (j >= 0 && n[j] > temp) {
				n[j + 1] = n[j];
				j--;
			}
			n[j + 1] = temp;
		}
	}

	public static void insertionSort2(int[] n) {
		for (int i = 1; i < n.length; i++) {
			int temp = n[i];
			for (int j = i - 1; j >= 0; j--) {
				if (n[j] > temp) {
					n[j + 1] = n[j];

				}
				if (n[j] < temp) {
					n[j + 1] = temp;
					break;
				}

			}
			for (int k : n)
				System.out.print(k + "\t");
			System.out.println();
		}

	}

	public static void xuanzeSort(int[] n) {
		int temp = 0;
		int count = 0;
		for (int i = 0; i < n.length - 1; i++) {
			temp = n[i];
			for (int j = i + 1; j < n.length; j++) {
				if (n[j] < temp) {
					temp = n[j];
					count = j;
				}
			}
			n[count] = n[i];
			n[i] = temp;
			/*
			 * for (int k : n) System.out.print(k); System.out.println();
			 */
		}
	}

	public static int partition(int A[], int left, int right) {
		int pivot = A[right];
		int tail = left - 1;
		for (int i = left; i < right; i++) {
			if (A[i] <= pivot) {
				tail++;
				exchange(A, tail, i);
			}

		}
		exchange(A, tail + 1, right);
		return tail + 1;

	}

	public static void quickSort(int[] n, int left, int right) {
		int pivotIndex;
		if (left < right) {
			pivotIndex = partition(n, left, right);
			quickSort(n, left, pivotIndex - 1);
			quickSort(n, pivotIndex + 1, right);
		}

	}

	public static void sortArrayAsRandom() {
		List list = new ArrayList<>();
		for (int i = 1; i <= 10; i++)
			list.add(i);
		Collections.shuffle(list);
		System.out.println(list.toString());
	}

	public static void classTest() {
		Button b = new Button();
		Class c1 = b.getClass();
		Class c2 = c1.getSuperclass();

	}
}
