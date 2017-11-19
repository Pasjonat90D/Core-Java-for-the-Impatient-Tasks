package com.task.chapter4.task5.shapes;

import com.task.chapter4.task5.Point;
import com.task.chapter4.task5.Shape;

public class Circle extends Shape {

    private double radius;

    public Circle(Point center, double radius){
        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return point;
    }

    @Override
    public Circle clone(){
        return new Circle(new Point(point.getX(),point.getY()),radius);
    }




}
