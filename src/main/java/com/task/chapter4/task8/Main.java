package com.task.chapter4.task8;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        int[] tab = new int[10];
        String string = "some";
        Point point = new Point();

        System.out.println("Table:");
        System.out.println("getCanonicalName = "+tab.getClass().getCanonicalName());
        System.out.println("getSimpleName = "+tab.getClass().getSimpleName());
        System.out.println("getTypeName = "+tab.getClass().getTypeName());
        System.out.println("getName = "+tab.getClass().getName());
        System.out.println("toString = "+tab.getClass().toString());
        System.out.println("toGenericString = "+tab.getClass().toGenericString());

        System.out.println("Object String:");
        System.out.println("getCanonicalName = "+string.getClass().getCanonicalName());
        System.out.println("getSimpleName = "+string.getClass().getSimpleName());
        System.out.println("getTypeName = "+string.getClass().getTypeName());
        System.out.println("getName = "+string.getClass().getName());
        System.out.println("toString = "+string.getClass().toString());
        System.out.println("toGenericString = "+string.getClass().toGenericString());

        System.out.println("Inner Class Point:");
        System.out.println("getCanonicalName = "+point.getClass().getCanonicalName());
        System.out.println("getSimpleName = "+point.getClass().getSimpleName());
        System.out.println("getTypeName = "+point.getClass().getTypeName());
        System.out.println("getName = "+point.getClass().getName());
        System.out.println("toString = "+point.getClass().toString());
        System.out.println("toGenericString = "+point.getClass().toGenericString());

        System.out.println("Inner Class Point:");
        System.out.println("getCanonicalName = "+int.class.getCanonicalName());
        System.out.println("getSimpleName = "+int.class.getSimpleName());
        System.out.println("getTypeName = "+int.class.getTypeName());
        System.out.println("getName = "+int.class.getName());
        System.out.println("toString = "+int.class.toString());
        System.out.println("toGenericString = "+int.class.toGenericString());


    }

    static class Point{

    }

}
