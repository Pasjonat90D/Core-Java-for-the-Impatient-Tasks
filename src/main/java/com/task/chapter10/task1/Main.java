package com.task.chapter10.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir");
        String name = "task1";
        List<Path> paths = Files.walk(Paths.get(path)).collect(Collectors.toList());

        paths.parallelStream().filter(path1 -> path1.getFileName().toString().equals(name)).forEach(System.out::println);

        //it is looking for the first one and using a parallel search
        //it is slow looking, because it has been set delay 2000ms
        Optional<Path> pathFist = paths.parallelStream().
                peek(path1 -> {
                    System.out.println("I'm searching in :" + path1);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }).filter(path1 -> path1.getFileName().
                toString().equals(name)).findFirst();
        System.out.println("First = " + pathFist.orElse(Paths.get(path)));

    }

}
