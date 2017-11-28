package com.task.chapter6.task21;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
            List<String>[] wynik = construct(new ArrayList<String>(),10);
            wynik[0] = new ArrayList<>();
            wynik[0].add("string");

            wynik[0].stream().forEach(System.out::println);
    }


    public static <E,T> T[] construct(List<E> list, int i){
            T[] tab = (T[]) Array.newInstance(list.getClass(),i);
            return tab;
    }
}
