package com.task.chapter3.task10;


import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Directory directory = new Directory( System.getProperty("user.dir"));
        List<File> allDirectory = directory.allDirectories();

        allDirectory.stream().forEach(System.out::println);

    }

}
