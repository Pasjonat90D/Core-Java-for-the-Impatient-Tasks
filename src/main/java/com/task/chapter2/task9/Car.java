package com.task.chapter2.task9;

public class Car {

    private double gas;
    private double mileage = 0;
    private final float COMBUSTION;

    public Car(double gas,float combustion){
        this.gas = gas;
        this.COMBUSTION = combustion;
    }
    public Car(float combustion){
        this.COMBUSTION = combustion;
    }

    public boolean go(double distance){
        if(distance*COMBUSTION<=gas){
            mileage = mileage + distance;
            return true;
        }
        else
            return false;
    }

    public double getLevelOfGas(){
        return gas;
    }
    public double getMileage(){
        return mileage;
    }

    public void addGas(double gas){
        this.gas = this.gas + gas;
    }

}
