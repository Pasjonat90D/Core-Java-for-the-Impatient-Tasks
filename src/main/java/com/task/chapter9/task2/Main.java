package com.task.chapter9.task2;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String fileInput = System.getProperty("user.dir") + "\\src\\main\\java\\com\\task\\chapter9\\task2" +
                "\\txt\\file.txt";
        String onlyFileName = fileInput.substring(fileInput.lastIndexOf(".") + 1);
        String filePathToc = fileInput.toString().substring(0, fileInput.lastIndexOf("\\") + 1) + onlyFileName + ".toc";
        System.out.print(filePathToc);
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Paths.get(filePathToc)))) {
            Arrays.stream(fileInput.split("\\\\")).forEach(s -> writer.println(s));
        } catch (IOException e) {
            System.err.print("File exists");
            e.printStackTrace();
        }

    }

}
