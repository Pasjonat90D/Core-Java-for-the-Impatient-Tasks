package com.task.chapter3.task7;

import java.util.*;

public class Sort {


    void luckySort(ArrayList<String> strings, Comparator<String> comp){
        List<String> list = new ArrayList<>(strings);
        boolean isSorted = false;
        while(!isSorted){
            Collections.shuffle(strings);
            Collections.sort(list);
            for(int i = 0 ; i<list.size();i++){
                if(strings.get(i).equals(list.get(i))){
                    isSorted =true;
                }
            }
        }
        strings.forEach(System.out::println);

    }
}
