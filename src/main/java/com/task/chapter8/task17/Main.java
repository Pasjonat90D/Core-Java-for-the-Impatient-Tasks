package com.task.chapter8.task17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.addAll(Arrays.asList(1, 1, 2, 2, 3, 3));
        listWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList()).forEach(System.out::println);

    }

}
