package com.northsunstrider.sort;

public class Exchange {

    public static void exchange(int array[], int x, int y) {
        int temp = array[y];
        array[y] = array[x];
        array[x] = temp;
    }
}
