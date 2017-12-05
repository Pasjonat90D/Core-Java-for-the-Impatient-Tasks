package com.task.chapter8.task9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String fileString = System.getProperty("user.dir") + "\\src\\main\\java\\com\\task\\chapter8\\txt" +
                "\\txt.txt";
        try (Stream<String> stream = Files.lines(Paths.get(fileString))) {
            IntSummaryStatistics statistics = stream.collect(Collectors.summarizingInt(String::length));
            System.out.print(statistics.getAverage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
