package com.northsunstrider.collection;

import java.util.HashMap;
import java.util.Map;

import com.northsunstrider.clz.Airplane;
import com.northsunstrider.clz1.Bat;

public class HashMapTest {

    public static void main(String[] args) {
        testMapKeyType();
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
