package com.task.chapter3.task12;


import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Directory directory = new Directory( System.getProperty("user.dir"));
        List<File> allDirectory = directory.allFiles();

        allDirectory.stream().forEach(System.out::println);

    }

}
