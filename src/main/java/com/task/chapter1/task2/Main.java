package com.task.chapter1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Wprowadź liczbę = ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.printf("Liczba w postaci dziesiętnej = %d\n", number);

    }
}
