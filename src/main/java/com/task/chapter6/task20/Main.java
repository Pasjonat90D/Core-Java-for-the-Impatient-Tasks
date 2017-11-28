package com.task.chapter6.task20;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args){
        System.out.println(Arrays.toString(repeat(4,"String", "what","how")));
    }


    @SafeVarargs
    public static final <T> T[] repeat(int n, T... objs){
        ArrayList<T> listT = new ArrayList<>();
        T temp = objs[0];
        T[] result = (T[]) Array.newInstance(temp.getClass(),(n*objs.length)-1);
        for(int i = 0 ;i< n;i++){
            for(T obj : objs){
                listT.add(obj);
            }
        }
        return listT.toArray(result);
    }

}



