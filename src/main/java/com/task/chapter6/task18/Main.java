package com.task.chapter6.task18;


import java.util.function.IntFunction;

public class Main {

    public static void main(String[] args){
       repeat(10,52,Integer[]::new);
    }



    public static <T> T[] repeat(int n, T obj, IntFunction<T[]> constr) {
        T[] wynik = constr.apply(n);
        for (int i = 0; i < n; i++) wynik[i] = obj;
        return wynik;
    }
}
