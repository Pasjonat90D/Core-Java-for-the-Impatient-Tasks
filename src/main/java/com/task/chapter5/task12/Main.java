package com.task.chapter5.task12;


import java.util.Arrays;



public class Main {

    public static void main(String[] args){
        int[] tab = {1,24,5,6,7,8,5,3,3,5,6,5,6,5};
        System.out.println(new Main().min(tab));



    }

    private int min(int[] values){
        int min = Arrays.stream(values).min().getAsInt();
        for(int i : values){
            assert i>min;
        }
        return min;
    }



}
