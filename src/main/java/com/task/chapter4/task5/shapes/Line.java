package com.task.chapter4.task5.shapes;

import com.task.chapter4.task5.Point;
import com.task.chapter4.task5.Shape;

public class Line extends Shape {

    private Point to;

    public Line(Point from, Point to){
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return point;
    }


    @Override
    public Line clone(){
        return new Line(new Point(point.getX(),point.getY()),new Point(to.getX(),to.getY()));
    }
}
