package com.task.chapter9.task15;

import java.io.Serializable;

public class Point implements Serializable {

    private static final long serialVersionUID = 1L;

    private double x;
    private double y;


    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
