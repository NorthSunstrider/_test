package com.northsunstrider.sort;

public class QuickSort extends Exchange {

	//
	public static void quickSort(int[] n, int left, int right) {

		int key = n[left];
		int start = left;
		int end = right;
		while (left < right) {
			for (int i = right; i > left; i--) {
				if (n[right] < key) {
					exchange(n, right, left);
					end = right;
					break;
				}
				for (int j = left; j < right; j++) {
					if (n[j] > key) {
						exchange(n, j, end);
						break;
					}

				}

			}
		}

	}

	public static void quickSort1(int[] n, int left, int right) {
		int key = n[left];
		int i = left;
		int j = right;
		while (i < j) {
			while (n[j] > key && j > i)
				j--;
			if (n[j] < key) {
				exchange(n, j, 0);
				i++;
			}
			while (n[i] < key && i < j)
				i++;
			if (n[i] > key) {
				exchange(n, i, j);
				j--;
			}
		}
		quickSort(n, left, i);
		quickSort(n, j, right);
	}

	public static void sort(int array[], int low, int high) {
		int l = low;
		int h = high;
		int povit = array[low];

		while (l < h) {
			while (l < h && array[h] >= povit)
				h--;
			if (l < h) {
				exchange(array, l, h);
				l++;
			}

			while (1 < h && array[l] < povit)
				l++;

			if (l < h) {
				exchange(array, h, l);
				h--;
			}

		}
		if (l > low)
			sort(array, low, l - 1);
		if (h < high)
			sort(array, l + 1, high);

	}

	public static void sort2(int arr[], int low, int high) {
		int l = low;
		int h = high;
		int povit = arr[low];

		while (l < h) {
			while (l < h && arr[h] >= povit)
				h--;
			if (l < h) {
				int temp = arr[h];
				arr[h] = arr[l];
				arr[l] = temp;
				l++;
			}

			while (l < h && arr[l] <= povit)
				l++;

			if (l < h) {
				int temp = arr[h];
				arr[h] = arr[l];
				arr[l] = temp;
				h--;
			}
		}
		System.out.print("l=" + (l + 1) + "h=" + (h + 1) + "povit=" + povit + "\n");
		if (l > low)
			sort2(arr, low, l - 1);
		if (h < high)
			sort2(arr, l + 1, high);
	}

}
