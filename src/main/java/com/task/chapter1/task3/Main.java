package com.task.chapter1.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       int[] tab= new int[3];
        for(int i=0;i<3;i++) {
            System.out.print("Number "+i +" = ");
            Scanner in = new Scanner(System.in);
            tab[i]= in.nextInt();
        }

        System.out.println("Max: "+maximalNumberFromTab(tab));
        System.out.println("Max using Math.max: " + maximalNumberFromTabUsingMathMax(tab));
    }

    static String maximalNumberFromTab(int[] tab){
        int max=tab[0];
        for(int i= 0;i<tab.length;i++){
            if(max<tab[i]){
                max= tab[i];
            }
        }
        return max+"";
    }

    static String maximalNumberFromTabUsingMathMax(int[] tab){
       int max = Math.max(tab[0],tab[1]);
       max = Math.max(max,tab[2]);
        return max+"";
    }
}
