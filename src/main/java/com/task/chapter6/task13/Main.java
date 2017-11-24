package com.task.chapter6.task13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> resultList = new ArrayList<>();

    public static void main(String[] args){
        Collections.addAll(list, new Integer[]{10, -10, 4, 205, 6});
        minmax(list, Comparator.comparingInt(o -> o), resultList);
        System.out.println(resultList.toString());
    }

    public static <T> void maxmin(List<T> elements,Comparator<? super T> comp, List<? super T> result) {
        minmax(elements, comp, result);
        changeHelp(Main.resultList, 0, 1);
    }

    private static <T> void changeHelp(ArrayList<T> elements, int i, int j) {
        T temp = elements.get(i);
        elements.set(i, elements.get(j));
        elements.set(j, temp);
    }

    public static <T> void minmax(List<T> elementy, Comparator<? super T> comp, List<? super T> result) {
        if (elementy.size() > 0) {
            T min = elementy.get(0);
            T max = elementy.get(0);
            for (T element : elementy) {
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
