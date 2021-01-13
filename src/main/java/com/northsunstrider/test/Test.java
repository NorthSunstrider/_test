package com.northsunstrider.test;

import java.awt.Button;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;

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
		// classTest();
//		hash1();
		reduce("C:\\Matrix\\", "Snipaste_2021-01-08_23-02-03.png", 100,100, false);
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

	// 测试java中的hash code方法
	public static void hash1() {
		int a = 0;
		String str = "aaa";
		System.out.println(str.hashCode());
		String s = "bbb";
		System.out.println(s.hashCode());
		System.out.println(new Object().hashCode());

	}

	public static String reduce(String base, String imgPath, int width, int height, boolean percentage) {
		try {
			File srcfile = new File(base + imgPath);
			BufferedImage src = ImageIO.read(srcfile);
			if (percentage) {
				double rate1 = ((double) src.getWidth(null)) / (double) width + 0.1;
				double rate2 = ((double) src.getHeight(null)) / (double) height + 0.1;
				double rate = rate1 > rate2 ? rate1 : rate2;
				width = (int) (((double) src.getWidth(null)) / rate);
				height = (int) (((double) src.getHeight(null)) / rate);
			}
			BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);				
			image.getGraphics().drawImage(src.getScaledInstance(width, height, Image.SCALE_AREA_AVERAGING), 0, 0, null);
			String newFile = getNewPath(imgPath);
			FileOutputStream out = new FileOutputStream(base + newFile);
			ImageIO.write(image ,"jpg",out);
//			JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
//			encoder.encode(image);
			image.flush();
			out.flush();
			out.close();
			src.flush();
			return newFile;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return "";
	}
	
	private static String getNewPath(String imgPath) {
		String filePrex = imgPath.substring(0, imgPath.lastIndexOf('.'));
		return filePrex + "0" + imgPath.substring(filePrex.length());
	}
}
