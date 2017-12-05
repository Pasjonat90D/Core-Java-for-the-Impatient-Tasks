package com.task.chapter8.task16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String fileString = System.getProperty("user.dir") + "\\src\\main\\java\\com\\task\\chapter8\\txt" +
                "\\War_and_Peace.txt";
        long timeStartStream = 0;
        long timeStopStream = 0;
        long timeStartStreamParallel = 0;
        long timeStopStreamParallel = 0;
        try (Stream<String> stream = Files.lines(Paths.get(fileString))) {
            List<String> strings = stream.flatMap(s -> Arrays.stream(s.split(" "))).collect(Collectors.groupingBy(String::length)).entrySet().stream().
                    sorted(Map.Entry.<Integer, List<String>>comparingByKey().reversed()).
                    map(integerListEntry -> integerListEntry.getValue()).limit(500).findFirst().orElse(new ArrayList<>());
            timeStartStream = System.currentTimeMillis();
            strings.forEach(s -> System.out.print(" " + s + " "));
            timeStopStream = System.currentTimeMillis();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Stream<String> stream = Files.lines(Paths.get(fileString))) {
            List<String> strings = stream.parallel().flatMap(s -> Arrays.stream(s.split(" "))).collect(Collectors.groupingBy(String::length)).entrySet().stream().
                    sorted(Map.Entry.<Integer, List<String>>comparingByKey().reversed()).
                    map(integerListEntry -> integerListEntry.getValue()).limit(500).findFirst().orElse(new ArrayList<>());
            timeStartStreamParallel = System.currentTimeMillis();
            strings.forEach(s -> System.out.print(" " + s + " "));
            timeStopStreamParallel = System.currentTimeMillis();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("\nTime stream: " + (timeStopStream - timeStartStream) + "\n" +
                "Time stream Parallel: " + (timeStopStreamParallel - timeStartStreamParallel) + "\n");

    }

}
