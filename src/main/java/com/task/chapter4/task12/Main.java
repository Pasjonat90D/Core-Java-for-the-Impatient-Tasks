package com.task.chapter4.task12;



import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        long startTimeReflection = System.nanoTime();

        Class<?> cl = null;
        try {
            cl = Class.forName(System.class.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
            Field field = cl.getDeclaredField("out");
            Class<?> printStreamClass = field.getType();
            Method printlnMethod = printStreamClass.getDeclaredMethod("println", String.class);
            Object object = field.get(null);
            printlnMethod.invoke(object, "Hello, world!");

        long endTimeReflection = System.nanoTime();
        long durationReflection = (endTimeReflection - startTimeReflection);

        long startTimeNormal = System.nanoTime();
        System.out.println("Hello, world");
        long endTimeNormal = System.nanoTime();

        long durationNormal = (endTimeNormal - startTimeNormal);

        System.out.println("Time Reflection ="+durationReflection+"\nNormal Time ="+durationNormal);
    }
}