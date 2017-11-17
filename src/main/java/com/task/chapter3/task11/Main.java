package com.task.chapter3.task11;


import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Directory directory = new Directory( System.getProperty("user.home"));
        List<File> allDirectory = directory.allFiles("ini");

        allDirectory.stream().forEach(System.out::println);

    }

}
