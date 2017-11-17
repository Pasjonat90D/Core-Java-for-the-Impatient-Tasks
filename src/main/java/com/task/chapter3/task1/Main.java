package com.task.chapter3.task1;

public class Main {


    public static void main(String[] args){
        Main main =new Main();

        Measurable[] objects = new Measurable[6];
        for(int i = 0 ;i<6;i++){
            objects[i] = new Employee(i+100, i);
        }
        System.out.print(main.average(objects));

    }



    double average(Measurable[] objects){
        double average = 0.0;
        for(Measurable measurable : objects){
            average = average + measurable.getMeasure();
        }
        return average/objects.length;
    }

}


