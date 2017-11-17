package com.task.chapter3.task7;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args){
        ArrayList<String> arrlist = new ArrayList<>();

        arrlist.add("A");
        arrlist.add("B");
        arrlist.add("C");

        Sort sortList = new Sort();
        sortList.luckySort(arrlist, String::compareTo);
    }
}
