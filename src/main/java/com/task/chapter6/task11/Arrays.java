package com.task.chapter6.task11;


import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;

public class Arrays {

    public static <E extends Comparable> Pair<E> firstLast(ArrayList<? extends E> a){
        return new Pair<>(a.get(0),a.get(a.size()-1));
    }

    public static <E extends Comparable> E min(ArrayList<E> list){
        return (E) list.get(list.indexOf (Collections.min(list)));
    }

    public static <E extends Comparable> E max(ArrayList<E> list){
        return (E) list.get(list.indexOf (Collections.max(list)));
    }

    public static <E extends Comparable> Pair<E> minMax(ArrayList<E> list){
        return new Pair<E>(min(list),max(list));
    }


}
