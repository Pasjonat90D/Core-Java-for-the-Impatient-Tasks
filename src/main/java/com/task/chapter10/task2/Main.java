package com.task.chapter10.task2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] tabString1 = {"a", "b", "ab", "abb", "abc", "agr",
                "qw", "w", "z", "zx", "vc", "eds"};
        String[] tabString2 = {"po", "o", "i", "u", "l", "k",
                "j", "mn", "jb", "uj", "ikm", "lkj",};

        long startParallelSort = System.currentTimeMillis();
        Arrays.parallelSort(tabString1);
        long endParallelSort = System.currentTimeMillis();

        long startArraysSort = System.currentTimeMillis();
        Arrays.sort(tabString2);
        long endArraysSort = System.currentTimeMillis();

        Arrays.stream(tabString1).forEach(System.out::print);

        Arrays.stream(tabString2).forEach(System.out::print);


        System.out.println("\nParallel Sort time:" + (endParallelSort - startParallelSort));
        System.out.println("Arrays Sort time:" + (endArraysSort - startArraysSort));


    }

}
