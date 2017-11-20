package com.task.chapter4.task11;



import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
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



    }
}