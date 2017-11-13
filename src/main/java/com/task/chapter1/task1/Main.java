package com.task.chapter1.task1;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        System.out.print("Wprowadź liczbę = ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        double numberDouble = number*(-1);

        System.out.printf("Liczba w postaci dziesiętnej = %d\n", number);
        System.out.printf("Liczba w postaci binarnej = %s\n", Integer.toBinaryString(number));
        System.out.printf("Liczba w postaci ósemkowej = %o\n", number);
        System.out.printf("Liczba w postaci szestnastkowej = %x\n", number);
        System.out.printf("Liczba w postaci odwrotność szesnastkowej liczby zmiennoprzecinkowej = %a\n", numberDouble);
    }
}
