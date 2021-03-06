package com.task.chapter7.task16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a","b","c","d"));
        getUnmodifiableCollection(list,100).stream().forEach(s -> System.out.print(" "+s+" "));
    }


    public static <E> Collection<E> getUnmodifiableCollection(ArrayList<E> list , int i){
        if(list.size()<100)
            i = list.size()-1;
        return Collections.unmodifiableCollection(list.subList(0,i));
    }

}
