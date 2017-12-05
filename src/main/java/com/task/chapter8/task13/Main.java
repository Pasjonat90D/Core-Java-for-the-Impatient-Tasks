package com.task.chapter8.task13;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("what");
        list.add("how");

        ArrayList<String> list2 = new ArrayList<>();
        list.add("what2");
        list.add("how2");

        Stream<ArrayList<String>> stream = Stream.of(list, list2);

        //add(stream).forEach(System.out::println);
        //add1(stream).forEach(System.out::println);
        add2(stream).forEach(System.out::println);
    }

    public static <T> ArrayList<T> add(Stream<ArrayList<T>> steam) {
        return steam.reduce((ts, ts2) -> Stream.concat(ts.stream(), ts2.stream()).
                collect(Collectors.toCollection(ArrayList::new))).orElse(new ArrayList<>());
    }

    public static <T> ArrayList<T> add1(Stream<ArrayList<T>> steam) {
        return steam.reduce(new ArrayList<>(), (ts, ts2) -> Stream.concat(ts.stream(), ts2.stream()).
                collect(Collectors.toCollection(ArrayList::new)));
    }

    public static <T> ArrayList<T> add2(Stream<ArrayList<T>> steam) {
        return steam.reduce(new ArrayList<>(), (ts, ts2) -> Stream.concat(ts.stream(), ts2.stream()).
                collect(Collectors.toCollection(ArrayList::new)), (ts, ts2) -> Stream.concat(ts.stream(), ts2.stream()).
                collect(Collectors.toCollection(ArrayList::new)));
    }

}
