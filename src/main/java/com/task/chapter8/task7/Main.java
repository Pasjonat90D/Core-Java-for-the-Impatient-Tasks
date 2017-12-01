package com.task.chapter8.task7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String fileString = System.getProperty("user.dir") + "\\src\\main\\java\\com\\task\\chapter8\\task7" +
                "\\War_and_Peace\\wrnpc.txt";
        try (Stream<String> stream = Files.lines(Paths.get(fileString))) {
            stream.flatMap(s -> Arrays.stream(s.split(" "))).filter(s -> s.length() > 0).
                    filter(s -> isAlphabetic(s)).limit(100).
                    forEach(s -> System.out.println(" " + s + " "));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Stream<String> stream = Files.lines(Paths.get(fileString))) {
            Map<String, Integer> map = stream.flatMap(s -> Arrays.stream(s.split(" "))).
                    filter(s -> s.length() > 0).filter(s -> isAlphabetic(s)).
                    collect(Collectors.groupingBy(t -> t.toLowerCase(), Collectors.summingInt(value -> 1)));
            map.entrySet().stream().sorted((o1, o2) -> o2.getValue() - o1.getValue()).
                    limit(10).forEach(entry -> System.out.print(" " + entry.getKey() + " "));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private static boolean isAlphabetic(String word) {
        long count = Arrays.stream(word.split("")).filter(s ->
                Character.isAlphabetic(s.codePoints().findAny().getAsInt())).count();
        return count == word.length();
    }


}
