package com.task.chapter7.task14;

import java.util.*;

public class Main {

    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a","b","c","d"));
        getUnmodifiableCollection(list,3).stream().forEach(s -> System.out.print(" "+s+" "));
    }


    public static Collection<String> getUnmodifiableCollection(ArrayList<String> list , int i){
        return Collections.unmodifiableCollection(list.subList(0,i));
    }
}
