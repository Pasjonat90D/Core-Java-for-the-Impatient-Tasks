package com.task.chapter3.task4;

import java.util.ArrayList;

import java.util.List;


public class IntSequence {


    public static IntSequence of(int ...parameters){
        return new IntSequence(){
            private List<Integer> list = new ArrayList<>();

            {
                for (int value:parameters){
                    list.add(value);}
            }

            public List<Integer> getList() {
                return list;
            }

            @Override
            public String toString(){
                return list.toString();
            }
        };
    }

}
