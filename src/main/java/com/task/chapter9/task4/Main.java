package com.task.chapter9.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        String fileString = System.getProperty("user.dir") + "\\src\\main\\java\\com\\task\\chapter8\\txt" +
                "\\War_and_Peace.txt";
        long startScanner = System.currentTimeMillis();
        int linesScanner = lineScanner(Paths.get(fileString));
        long endScanner = System.currentTimeMillis();
        System.out.println("Lines : " + linesScanner + " Time: " + (endScanner - startScanner));
        long startBuffer = System.currentTimeMillis();
        int linesBuffer = lineBufferedReader(Paths.get(fileString));
        long endBuffer = System.currentTimeMillis();
        System.out.println("Lines : " + linesBuffer + " Time: " + (endBuffer - startBuffer));
        long startLines = System.currentTimeMillis();
        long linesLines = lineBufferedReaderLines(Paths.get(fileString));
        long endLines = System.currentTimeMillis();
        System.out.println("Lines : " + linesLines + " Time: " + (endLines - startLines));
    }

    //comfortable speed:140
    private static long lineBufferedReaderLines(Path path) {
        long numberOfLines = 0;
        try (Stream<String> stream = Files.newBufferedReader(path).lines()) {
            numberOfLines = stream.count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numberOfLines;
    }

    //fast speed:94
    private static int lineBufferedReader(Path path) {
        int numberOfLines = 0;
        String line = null;
        try (BufferedReader reader = new BufferedReader(Files.newBufferedReader(path))) {
            while ((line = reader.readLine()) != null) {
                numberOfLines++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numberOfLines;
    }

    //speed: 438
    private static int lineScanner(Path path) {
        int numberOfLines = 0;
        try (Scanner scanner = new Scanner(path);) {
            while (scanner.hasNextLine()) {
                numberOfLines++;
                scanner.nextLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numberOfLines;
    }

}
