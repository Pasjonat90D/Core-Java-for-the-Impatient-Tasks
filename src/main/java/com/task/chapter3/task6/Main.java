package com.task.chapter3.task6;

import org.apache.commons.lang3.ObjectUtils;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args){
        int[] tab = new int[10];
        for(int i=0;i<10;i++){
            tab[i]=i;
        }
        DigitSequence digitSequence = new DigitSequence(tab);
        while(digitSequence.hasNext()){
            System.out.println(digitSequence.next()+" ");
        }
        digitSequence.remove();
        digitSequence.forEachRemaining(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {

            }
        });
    }

}
