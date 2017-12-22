package com.task.chapter10.task7;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        String pathFiles = System.getProperty("user.dir") + "\\src\\main\\java\\com\\task\\chapter1";
        Set<Path> files = getAllFile(pathFiles);
        ConcurrentHashMap<String, Long> occurrenceOfWords = new ConcurrentHashMap<>();

        files.parallelStream().forEach(path -> {
            try (Stream<String> streamLine = Files.lines(path)) {
                streamLine.forEach(s -> {
                    String[] wordsFromLine = s.split(" ");
                    for (String word : wordsFromLine) {
                        occurrenceOfWords.merge(word, 1L, Long::sum);
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        Map.Entry<String, Long> result = occurrenceOfWords.reduceEntries(0, (stringLongEntry, stringLongEntry2) ->
                returnMapValue(stringLongEntry.getKey(), stringLongEntry.getValue() + stringLongEntry2.getValue())
        );
        System.out.println("Word: '" + result.getKey() + "' ,Count :" + result.getValue());
    }

    public static <K, V> Map.Entry<K, V> returnMapValue(K k, V v) {
        return new java.util.AbstractMap.SimpleEntry<K, V>(k, v);
    }

    private static Set<Path> getAllFile(String pathFiles) throws IOException {
        Set<Path> files = new HashSet<>();
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
        return files;
    }
}
