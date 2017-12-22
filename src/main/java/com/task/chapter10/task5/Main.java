package com.task.chapter10.task5;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        String pathFiles = System.getProperty("user.dir") + "\\src\\main\\java\\com\\task\\chapter1";
        Set<Path> files = new HashSet<>();
        ConcurrentHashMap<String, Set<File>> occurrenceOfWords = new ConcurrentHashMap<>();

        Files.walkFileTree(Paths.get(pathFiles), new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (attrs.isDirectory()) {
                    return FileVisitResult.CONTINUE;
                }
                files.add(file);
                return FileVisitResult.CONTINUE;
            }
        });

        files.parallelStream().forEach(path -> {
            try (Stream<String> streamLine = Files.lines(path)) {
                streamLine.forEach(s -> {
                    String[] wordsFromLine = s.split(" ");
                    for (String word : wordsFromLine) {
                        occurrenceOfWords.merge(word, Collections.singleton(path.toFile()),
                                (existListFiles, newListFiles) -> Stream.concat(existListFiles.stream()
                                        , newListFiles.stream()).collect(Collectors.toSet()));
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        occurrenceOfWords.forEach((s, filesSet) -> System.out.println("Word :" + s + " Set :" + filesSet.toString()));
    }
}
