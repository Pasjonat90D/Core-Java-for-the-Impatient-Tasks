package com.task.chapter9.task1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        String fileInput = System.getProperty("user.dir") + "\\src\\main\\java\\com\\task\\chapter9\\task1" +
                "\\txt\\file.txt";
        String fileOutput = System.getProperty("user.dir") + "\\src\\main\\java\\com\\task\\chapter9\\task1" +
                "\\txt\\file1.txt";

        try (InputStream inputStream = Files.newInputStream(Paths.get(fileInput))) {
            copyWithClassFiles(inputStream, fileOutput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copyWithClassFiles(InputStream inputStream, String filePath) throws IOException {
        if (!Files.exists(Paths.get(filePath)))
            Files.copy(inputStream, Paths.get(filePath));
        else
            System.out.print("File is exist.");
    }

    private static void copyWithTempFile(InputStream inputStream, String filePath) throws IOException {
        File tempFile = File.createTempFile(Paths.get(filePath).getParent().toString(), null, null);
        FileOutputStream outputStream = new FileOutputStream(tempFile);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read()) > 0) {
            outputStream.write(buffer, 0, length);
        }

    }


}
