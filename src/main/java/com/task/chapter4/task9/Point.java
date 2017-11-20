package com.task.chapter4.task9;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString(){
        Class<?> cl = null;
        try {
            cl = Class.forName(Point.class.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        while (cl != null) {
            for (Field field : cl.getDeclaredFields()) {

                try {
                    System.out.println(Modifier.toString(field.getModifiers())+" "+field.getName()+" = "+field.get(this));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }
            cl = cl.getSuperclass();
        }
        return null;
    }

}
