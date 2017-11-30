package com.task.chapter7.task17;

import java.util.*;

public class Main {

    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a","b","c","d"));
        getUnmodifiableCollection(list,3).stream().forEach(s -> System.out.print(" "+s+" "));
    }

    public static <E> Collection<E> getUnmodifiableCollection(ArrayList<E> list , int i){
        Class object = list.get(0).getClass();
        List<E> list1 = Collections.checkedList(list , object);
        return Collections.unmodifiableCollection(list1.subList(0,i));
    }
}
