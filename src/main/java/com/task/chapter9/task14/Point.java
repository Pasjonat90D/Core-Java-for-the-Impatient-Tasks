package com.task.chapter9.task14;

import java.io.Serializable;

public class Point implements Serializable {

    private double x;
    private double y;


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
