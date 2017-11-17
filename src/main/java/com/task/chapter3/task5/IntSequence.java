package com.task.chapter3.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class IntSequence {

    public static void constant(int number){
        List<Integer> list =new  ArrayList<>();
        //loop break
        for(int i=0;i<100;i++){
            list.add(number);
            list.forEach(toPrint -> System.out.print(toPrint+" , "));
        }
    }

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
