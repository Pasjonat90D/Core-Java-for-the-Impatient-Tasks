package com.task.chapter6.task5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
//        Double[] score = change(0, 1, 1.5, 2, 3);
//        Error:(8, 33) java: incompatible types: inferred type does not conform to upper bound(s)
//                inferred: java.lang.Number&java.lang.Comparable<? extends java.lang.Number&java.lang.Comparable<?>>
//        upper bound(s): java.lang.Double,java.lang.Object

//        Double[] score = Arrays.<Double>change(0, 1, 1.5, 2, 3);
//        Error:(13, 32) java: cannot find symbol
//        symbol:   method <java.lang.Double>change(int,int,double,int,int)
//        location: class java.util.Arrays

        Double[] score = change(0,1,1.5,1.3,1.8,6d);
        System.out.println(Arrays.toString(score));
    }


        public static <T> T[] change(int i, int j, T... value) {
        T temp = value[i];
        value[i] = value[j];
        value[j] = temp;
        return value;
    }
}
