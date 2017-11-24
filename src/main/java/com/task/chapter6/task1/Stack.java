package com.task.chapter6.task1;

import java.util.ArrayList;

public class Stack<E> {

    private ArrayList<E> list = new ArrayList<>();

    public void push(E item){
        list.add(0,item);
    }

    public E pop(){
        return list.remove(0);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString(){
        return list.toString();
    }


}
