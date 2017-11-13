package com.task.chapter1.task15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Rows  = ");
        Scanner in = new Scanner(System.in);
        int howManyRow = in.nextInt();

        List<List<Integer>> pascalsTriangle = new ArrayList<>();
        for (int i = 0; i < howManyRow; i++) {
            List<Integer> row = new ArrayList<>();
            int number = 1;
            for (int j = 0; j <= i; j++) {
               row.add(number);
                number = number * (i - j) / (j + 1);
            }
            pascalsTriangle.add(row);
        }
        System.out.println(pascalsTriangle);
    }

}
