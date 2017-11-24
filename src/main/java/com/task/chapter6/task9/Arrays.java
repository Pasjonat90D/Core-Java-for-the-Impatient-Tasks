package com.task.chapter6.task9;


import java.util.ArrayList;

public class Arrays {

    public static <E extends Comparable> Pair<E> firstLast(ArrayList<? extends E> a){
        return new Pair<>(a.get(0),a.get(a.size()-1));
    }

}
