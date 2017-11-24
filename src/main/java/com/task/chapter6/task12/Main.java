package com.task.chapter6.task12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> result = new ArrayList<>();

    public static void main(String[] args){
        Collections.addAll(list, new Integer[]{10, -10, 4, 205, 6});
        minmax(list, Comparator.comparingInt(o -> o),result);
        System.out.println(result.toString());
    }


    public static <T> void minmax(List<T> elements, Comparator<? super T> comp, List<? super T> result) {
        if (elements.size() > 0) {
            T min = elements.get(0);
            T max = elements.get(0);
            for (T element : elements) {
                if (comp.compare(element, min) < 0) {
                    min = element;
                }
                if ((comp.compare(element, max) > 0)) {
                    max = element;
                }
            }
            result.add(min);
            result.add(max);
        }
    }
}
