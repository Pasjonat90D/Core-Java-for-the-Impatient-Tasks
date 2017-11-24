package com.task.chapter5.task11;

import java.util.Objects;

public class Main {

    public static void main(String[] args){
        String s = "c";
        String sNull = null;

        Objects.requireNonNull(s);
//        Objects.requireNonNull(sNull); //exception

        assert s != null;
        assert sNull != null;           //no exception



    }
}
