package com.task.chapter6.task10;


import java.util.ArrayList;
import java.util.Collections;

public class Arrays {

    public static <E extends Comparable> Pair<E> firstLast(ArrayList<? extends E> a){
        return new Pair<>(a.get(0),a.get(a.size()-1));
    }

    public static <E extends Comparable> E min(ArrayList<E> a){
        return (E) a.get(a.indexOf (Collections.min(a)));
    }

    public static <E extends Comparable> E max(ArrayList<E> a){
        return (E) a.get(a.indexOf (Collections.max(a)));
    }


}
