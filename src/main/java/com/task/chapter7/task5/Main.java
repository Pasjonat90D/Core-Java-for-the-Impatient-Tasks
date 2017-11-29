package com.task.chapter7.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public class Main {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        change(list,0,1);
    }

    public static void change(List<?> list, int i, int j){
            if(list instanceof RandomAccess){
               Object objI = list.get(i);
               Object objJ = list.get(j);
               objI  = objJ;
               objJ = list.get(i);
            } else{
                Object objI =null;
                Object objJ = null;
                objI  = objJ;
                objJ = list.get(i);
            }
    }
}
