package com.task.chapter2.task7.task6;
//toDo
public class Point {

    private double x;
    private double y;

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

    public void translate(double x, double y) {
        this.x = this.x + x;
        this.y = this.y + y;
    }

    public void scale(double scale){
        this.x = this.x * scale;
        this.y = this.y * scale;
    }

    @Override
    public String toString(){
        return "x="+x+" y="+y;
    }

}
