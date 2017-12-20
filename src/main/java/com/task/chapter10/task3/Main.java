package com.task.chapter10.task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private static final String word = "java";

    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService exec = Executors.newFixedThreadPool(10);
        Set<Path> paths = Files.walk(Paths.get(System.getProperty("java.home"))).collect(Collectors.toSet());
        List<Callable<String>> tasks = new ArrayList<>();
        for (Path path : paths) {
            tasks.add(() ->
                    {
                        String result = findWord(path);
                        while (result.equals(word)) {
                            if (Thread.currentThread().isInterrupted())
                                return null;
                        }
                        return result;
                    }
            );
        }
        List<Future<String>> result = exec.invokeAll(tasks);
        Arrays.stream(result.toArray()).forEach(System.out::println);
    }


    public static String findWord(Path path) {
        String result = "";
        try (Stream<String> stream = Files.lines(path)) {
            result = stream.filter(s -> s.equals(word)).findAny().orElse("''");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
