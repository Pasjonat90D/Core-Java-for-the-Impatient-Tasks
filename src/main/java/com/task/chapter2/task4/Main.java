package com.task.chapter2.task4;

import org.omg.CORBA.IntHolder;

public class Main {

    private static IntHolder first = new IntHolder(1);
    private static IntHolder second = new IntHolder(2);


    public static void main(String[] args){
        changeContent();
       System.out.print("First = "+first.value+"\nSecond = "+second.value);

    }

    public static void changeContent(){
        IntHolder temp = first;
        first = second;
        second = temp;
    }
}
