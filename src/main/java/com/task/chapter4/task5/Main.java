package com.task.chapter4.task5;


import com.task.chapter4.task5.shapes.Circle;

public class Main {

    public static void main(String[] args){
        Circle circle = new Circle(new Point(0,0),10);
        Point point = circle.getCenter();

        Circle circleClone = circle.clone();

        System.out.println(circleClone);

    }
}
