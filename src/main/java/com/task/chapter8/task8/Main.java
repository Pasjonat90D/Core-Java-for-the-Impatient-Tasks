package com.task.chapter8.task8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private static String[] vowels = {"a", "e", "y", "u", "i", "o"};

    public static void main(String[] args) {
        String fileString = System.getProperty("user.dir") + "\\src\\main\\java\\com\\task\\chapter8\\txt" +
                "\\War_and_Peace.txt";
        try (Stream<String> stream = Files.lines(Paths.get(fileString))) {
            List<String> allWords = stream.flatMap(s -> Arrays.stream(s.split(" "))).
                    filter(s -> isAlphabetic(s)).collect(Collectors.toList());
            allWords.forEach(s -> System.out.println(" " + s + " "));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static boolean isAlphabetic(String word) {
        long count = Arrays.stream(word.split("")).flatMap(s -> Arrays.stream(vowels).
                map(s1 -> s1.equals(s))).filter(aBoolean -> aBoolean.equals(true)).count();
        if (count > 4)
            return true;
        else
            return false;

    }
}