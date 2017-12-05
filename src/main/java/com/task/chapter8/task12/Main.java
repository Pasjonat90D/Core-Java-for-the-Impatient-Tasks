package com.task.chapter8.task12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("String1", "String2");
        Stream<String> stream2 = Stream.of("String3", "String4");
        zip(stream1, stream2).forEach(System.out::println);

    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> list1 = first.collect(Collectors.toList());
        List<T> list2 = second.collect(Collectors.toList());
        List<T> contain = new ArrayList<>();
        int size;
        if (list1.size() > list2.size())
            size = list1.size();
        else
            size = list2.size();
        for (int i = 0; i < size; i++) {
            contain.add(list1.get(i));
            contain.add(list2.get(i));
        }
        return contain.stream();
    }

}
