package com.task.chapter4.task4.shapes;

import com.task.chapter4.task4.Point;
import com.task.chapter4.task4.Shape;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height){
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return null;
    }
}
