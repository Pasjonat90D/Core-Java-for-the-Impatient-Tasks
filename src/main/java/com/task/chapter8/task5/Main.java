package com.task.chapter8.task5;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        letters("zxcvb").forEach(s -> System.out.print(" " + s + " "));
    }

    public static Stream<String> letters(String s) {
        return Arrays.stream(s.split(""));
    }
}
