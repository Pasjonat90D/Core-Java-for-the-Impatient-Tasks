package com.task.chapter9.task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {

        String fileInput = System.getProperty("user.dir") + "\\src\\main\\java\\com\\task\\chapter9\\task3" +
                "\\txt\\file.txt";
        try (Stream<String> stream = Files.lines(Paths.get(fileInput))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
