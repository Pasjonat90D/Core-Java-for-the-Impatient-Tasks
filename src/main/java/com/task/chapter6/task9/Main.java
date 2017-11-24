package com.task.chapter6.task9;


import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, new Integer[]{10, 2, 4, 5, 6});
        Pair<Integer> firstLast = Arrays.firstLast(list);
        System.out.println("First = " + firstLast.getFirst() + " Second = " + firstLast.getSecond());
    }

}
