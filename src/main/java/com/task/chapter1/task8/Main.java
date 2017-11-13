package com.task.chapter1.task8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Text = ");
        String text = in.next();
        System.out.print(text.replaceAll("[^\\p{IsAlphabetic}^\\p{IsDigit}]" , ""));
    }
}
