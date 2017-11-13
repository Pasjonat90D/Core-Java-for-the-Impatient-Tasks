package com.task.chapter1.task16;

public class Main {


    public static double average(double firstValue ,double... values) {
        double sum = firstValue;
        for (double v : values) sum += v;
        return values.length == 0 ? 0 : sum / values.length;
    }


}
