package com.task.chapter5.task10;

public class Main {

    private static long depth=0L;

    public static void main(String[] args){
        factorial();
    }

    private static void factorial(){
        System.err.println(++depth);
        factorial();
    }

}
