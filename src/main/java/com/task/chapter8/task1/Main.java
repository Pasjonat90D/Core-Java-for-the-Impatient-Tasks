package com.task.chapter8.task1;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<String> words = Stream.of("xxxxxxxxxxxz", "xxxxxxxxxxxx", "xxxxxxxxxxxc",
                "xxxxxxxxxxxv", "xxxxxxxxxxxb", "xxxxxxxxxxxn");

        long count = words.filter(s -> s.length() > 11).peek(s -> System.out.print(" " + s + " ")).limit(5).count();

    }
}
