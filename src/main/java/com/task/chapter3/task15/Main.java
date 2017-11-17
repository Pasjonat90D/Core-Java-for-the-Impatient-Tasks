package com.task.chapter3.task15;



public class Main {

    public static void main(String[] args){
        IntSequence intSequence = new IntSequence().randomInts(50,100);
        IntSequence.RandomSequence randomSequence = intSequence.new RandomSequence();
        System.out.println(randomSequence.next());
    }




}



