package com.northsunstrider.collection;

import java.util.HashMap;
import java.util.Map;

import com.northsunstrider.clz.Airplane;
import com.northsunstrider.clz.Bat;
import com.northsunstrider.clz.Fly;

public class HashMapTest {

	public static void main(String[] args) {
		testMapKeyType();
		int a;
		System.out.println(a=7);
		
		String c="abc";
		String b="a"+new String("bc");
		System.out.println(c==b);
	}

	public static void testMapKeyType() {
		Map map = new HashMap<>();

		Bat bat = new Bat();
		map.put(bat, "aaa");

		Airplane airplane = new Airplane();
		map.put(airplane, "bbb");

		System.out.println(map.get(airplane));

	}

}
