package com.northsunstrider.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUserSort {

	public static void main(String[] args) {
		// testCompare();
		testSortByComparator();
	}

	public static void testCompare() {
		SortUser su1 = new SortUser(6, "James");
		SortUser su2 = new SortUser(11, "Tom");
		int result = su1.compareTo(su2);
		System.out.println(result);
	}

	public static void testSortByComparable() {
		SortUser su1 = new SortUser(72, "James");
		SortUser su2 = new SortUser(11, "Tom");
		SortUser su25 = new SortUser(27, "Kobe1");
		SortUser su3 = new SortUser(33, "Jack");
		SortUser su4 = new SortUser(24, "Jerry");
		SortUser su45 = new SortUser(27, "Kobe2");
		SortUser su5 = new SortUser(27, "Kobe3");
		List<SortUser> list = new ArrayList<SortUser>();
		list.add(su1);
		list.add(su2);
		list.add(su25);
		list.add(su3);
		list.add(su4);
		list.add(su45);
		list.add(su5);

		Collections.sort(list);

		for (SortUser su : list)
			System.out.println(su.getAge() + "  " + su.getName());
	}

	public static void testSortByComparator() {
		SortUser su1 = new SortUser(72, "James");
		SortUser su2 = new SortUser(11, "Tom");
		SortUser su25 = new SortUser(27, "Kobe1");
		SortUser su3 = new SortUser(33, "Jack");
		SortUser su4 = new SortUser(24, "Jerry");
		SortUser su45 = new SortUser(27, "Kobe2");
		SortUser su5 = new SortUser(27, "Kobe3");
		List<SortUser> list = new ArrayList<SortUser>();
		list.add(su1);
		list.add(su2);
		list.add(su25);
		list.add(su3);
		list.add(su4);
		list.add(su45);
		list.add(su5);

		Collections.sort(list, new Comparator<SortUser>() {

			@Override
			public int compare(SortUser o1, SortUser o2) {
				if (o2.getAge() > o1.getAge())
					return -1;
				if (o2.getAge() < o1.getAge())
					return 1;
				return 0;
			}

		});

		for (SortUser su : list)
			System.out.println(su.getAge() + "  " + su.getName());
	}
}
