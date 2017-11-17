package com.task.chapter3.task2;


public class Employee implements Measurable {

    private static int id_class;
    private int id;
    private double measure;
    private String name;
    private double salary;

    public Employee(double measure, String name, double salary){
        id = id_class;
        id_class++;
        this.measure = measure;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }



    @Override
    public double getMeasure() {
        return measure;
    }
}
