package com.task.chapter3.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Main {


    public static void main(String[] args){
        Main main =new Main();

        Measurable[] objects = new Measurable[6];
        for(int i = 0 ;i<6;i++){
            objects[i] = new Employee(i+100,"Name "+i, i);
        }
        System.out.println(main.average(objects));
        Measurable theHighestSalary = main.largest(objects);
        if(theHighestSalary instanceof Employee){
            System.out.println(((Employee) theHighestSalary).getName());
        }

    }


    Measurable largest(Measurable[] objects){
       Optional<Measurable> maxSalry = Arrays.stream(objects).max(Comparator.comparingDouble(Measurable::getMeasure));
       return maxSalry.get();

    }

    double average(Measurable[] objects){
        double average = 0.0;
        for(Measurable measurable : objects){
            average = average + measurable.getMeasure();
        }
        return average/objects.length;
    }

}


