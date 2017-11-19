package com.task.chapter4.task2;

import java.util.Objects;

public class LabeledPoint extends Point {

    private String label;

    public LabeledPoint(String label, double x,double y){
        super(x,y);
        this.label = label;
    }

    public String getLabel(){
        return label;
    }

    @Override
    public String toString(){
        return "x="+super.getX()+" y="+super.getY()+" label="+getLabel();
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        LabeledPoint other = (LabeledPoint) obj;
        return getX() == other.getX() && getY() == other.getY() && Objects.equals(label,other.label);
    }

    @Override
    public int hashCode(){
        return (int) (31*super.getX()+super.getY());
    }


}
