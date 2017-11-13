package com.task.chapter2.task5;

public final class Point {

    private final double x;
    private final double y;

    public Point() {
        this.x = 0;
        this.y = 0;
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

    public Point translate(double x, double y) {
        return new Point(getX()+x,getY()+y);
    }

    public Point scale(double scale){
        return new Point(getX() * scale,getY() * scale);
    }

    @Override
    public String toString(){
        return "x="+x+" y="+y;
    }

}
