package com.task.chapter8.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String fileString = System.getProperty("user.dir") + "\\src\\main\\java\\com\\task\\chapter8\\task2" +
                "\\War_and_Peace\\wrnpc.txt";
        try (Stream<String> stream = Files.lines(Paths.get(fileString))) {
            long timeStart = System.currentTimeMillis();
            long count = stream.filter(s -> s.length() > 10).count();
            long timeStop = System.currentTimeMillis();
            System.out.println("Stream:");
            System.out.println("Worlds >10 :" + count + "  Time: " + (timeStop - timeStart));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Stream Parallel
        try (Stream<String> stream = Files.lines(Paths.get(fileString))) {
            long timeStart = System.currentTimeMillis();
            long count = stream.parallel().filter(s -> s.length() > 10).count();
            long timeStop = System.currentTimeMillis();
            System.out.println("Stream Parallel:");
            System.out.println("Worlds >10 :" + count + "  Time: " + (timeStop - timeStart));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
