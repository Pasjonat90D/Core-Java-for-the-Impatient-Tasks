package com.task.chapter2.task9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Combustion = ");
        float combustion = in.nextFloat();
        System.out.print("Gas = ");
        double gas = in.nextDouble();
        Car car = new Car(gas, combustion);
        System.out.print("Distance = ");
        if (car.go(in.nextDouble()))
            System.out.println("Mileage = " + car.getMileage());
        else
            System.out.println("Add more gas");
    }

}
