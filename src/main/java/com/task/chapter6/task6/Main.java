package com.task.chapter6.task6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> toList = new ArrayList<>(3);
        toList.add("what");
        toList.add("how");
        toList.add("many");

        ArrayList<String> fromList = new ArrayList<>(2);
        fromList.add("book");
        fromList.add("5");

        ArrayList<String> list = addAll(toList, fromList);
        ArrayList<String> listExtends = addAllWithExtends(toList, fromList);
        ArrayList<? super String> listSuper = addAllWithSuper(toList, fromList);

        System.out.println(list.toString());
        System.out.println(listExtends.toString());
        System.out.println(listSuper.toString());
    }


    public static <E> ArrayList<E> addAll(ArrayList<E> toList, ArrayList<E> fromList) {
        toList.addAll(fromList);
        return toList;
    }

    public static <E> ArrayList<E> addAllWithExtends(ArrayList<E> toList, ArrayList<? extends E> fromList) {
        toList.addAll(fromList);
        return toList;
    }

    public static <E> ArrayList<? super E> addAllWithSuper(ArrayList<? super E> toList, ArrayList<E> fromList) {
        toList.addAll(fromList);
        return toList;
    }


}
