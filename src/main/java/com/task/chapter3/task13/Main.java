package com.task.chapter3.task13;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        Print[] runnables = {
                new Print(),new Print(),new Print(),new Print(),new Print()
        };
        runing(runnables);


    }



    public static Runnable runing(Print[] tab){
        Arrays.stream(tab).forEach(print -> print.run());
        return () -> new Print();
    }
}
