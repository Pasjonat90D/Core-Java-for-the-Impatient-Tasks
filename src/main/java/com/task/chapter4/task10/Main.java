package com.task.chapter4.task10;


import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Class clazz = int[].class;

        while (clazz != null) {
            for (Method m : clazz.getDeclaredMethods()) {
                System.out.println(
                        Modifier.toString(m.getModifiers()) + " " +
                                m.getReturnType().getCanonicalName() + " " +
                                m.getName() +
                                Arrays.toString(m.getParameters()));
            }
            clazz = clazz.getSuperclass();
        }
    }

}
