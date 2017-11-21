package com.task.chapter5.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NestedTry {

    public static void main(String[] args)  {
        Path path = Paths.get("cos");
        BufferedReader in = null;
        try {
            in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
            String line= "";
            while((line = in.readLine())!=null){

            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.err.println("Caught exception: " + e.getMessage());
                }
            }
        } catch (IOException ex) {
            System.err.println("Przechwycony wyjątek: " + ex.getMessage());
        }
    }
}
