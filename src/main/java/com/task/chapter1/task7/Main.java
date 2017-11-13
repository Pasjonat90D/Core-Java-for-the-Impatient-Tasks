package com.task.chapter1.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("a = ");
        short number1 = (short) (in.nextInt() - 32768);
        System.out.println("b = ");
        short number2 = (short) (in.nextInt() - 32768);

        System.out.println("a+b = " + ((number1 + 32768)+(number2 + 32768)));
        System.out.println("a-b = " + ((number1 + 32768)-(number2 + 32768)));
        System.out.println("a*b = " + (((long)number1 + 32768)*((long)number2 + 32768)));
        System.out.println("a/b = " + ((number1 + 32768)/(number2 + 32768)));
        System.out.println("a%b = " + ((number1 + 32768)%(number2 + 32768)));




    }
}
