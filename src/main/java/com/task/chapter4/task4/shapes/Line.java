package com.task.chapter4.task4.shapes;

import com.task.chapter4.task4.Point;
import com.task.chapter4.task4.Shape;

public class Line extends Shape {

    private Point to;

    public Line(Point from, Point to){
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return null;
    }
}
