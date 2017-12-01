package com.task.chapter8.task3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] values = {1, 4, 9, 16};
        IntStream streamInt = Arrays.stream(values);
        streamInt.forEach(value -> System.out.print(" " + value + " "));
    }
}
