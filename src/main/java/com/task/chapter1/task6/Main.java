package com.task.chapter1.task6;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        int i = 100;
        System.out.println("100! = " + factorial(i).toPlainString());

    }

    public static BigDecimal factorial(int i){
        if(i==1)
            return new BigDecimal(1);
        BigDecimal bigDecimal = new BigDecimal(i);
        bigDecimal = bigDecimal.multiply(factorial(i-1));
        return bigDecimal;
    }
}
