package com.task.chapter5.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TryWithResources {

    public static void main(String[] args)  {
        Path path = Paths.get("cos");
        try(BufferedReader in  = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line= "";
            while((line = in.readLine())!=null){

            }
        } catch (IOException e) {
            System.err.println("Caught exception: " + e.getMessage());
        }
    }
}
