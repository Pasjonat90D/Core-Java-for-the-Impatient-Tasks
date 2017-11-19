package com.task.chapter4.task5.shapes;

import com.task.chapter4.task5.Point;
import com.task.chapter4.task5.Shape;

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
        return point;
    }


    @Override
    public Rectangle clone(){
        return new Rectangle(new Point(point.getX(),point.getY()),width,height);
    }
}
