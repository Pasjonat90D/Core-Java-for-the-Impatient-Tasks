package com.task.chapter9.task15;

public class PointTable extends Point {

    private static final long serialVersionUID = 2L;

    private double[] coordinates = new double[2];

    public PointTable(double x, double y) {
        coordinates[0] = x;
        coordinates[1] = y;
    }

    public double getX() {
        return coordinates[0];
    }

    public double getY() {
        return coordinates[1];
    }
}
