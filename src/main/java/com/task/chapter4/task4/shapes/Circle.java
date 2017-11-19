package com.task.chapter4.task4.shapes;

import com.task.chapter4.task4.Point;
import com.task.chapter4.task4.Shape;

public class Circle extends Shape {

    private double radius;

    public Circle(Point center, double radius){
        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return null;
    }
}
