package com.task.chapter6.task2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Stack<E> {

    E[] tab;


    public Stack(Class<E> c) {
        tab = newArray(c, 0);
    }


    public void push(E item) {
        E[] temp = newArray(item.getClass(), tab.length + 1);
        temp[0] = item;
        System.arraycopy(tab, 0, temp, 1, tab.length);
        tab = temp;
    }

    public E pop() {
            E[] temp = newArray(tab[0].getClass(), tab.length - 1);
            E result = tab[0];
            System.arraycopy(tab, 1, temp, 0, tab.length - 1);
            tab = temp;
            return result;
    }

    public boolean isEmpty() {
        return tab.length == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(tab);
    }

    private static <T> T[] newArray(Class<?> type, int len) {
        return (T[]) Array.newInstance(type, len);
    }


}
