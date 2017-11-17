package com.task.chapter3.task1;



public class Employee implements Measurable {

    private static int id_class;
    private int id;
    private double measure;
    private double salary;

    public Employee(double measure, double salary){
        id = id_class;
        id_class++;
        this.measure = measure;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double getMeasure() {
        return measure;
    }
}
