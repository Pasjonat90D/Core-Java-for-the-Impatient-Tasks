package com.task.chapter5.task5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(Paths.get("/usr/share/dict/words"));
            try {
                PrintWriter out = new PrintWriter("output.txt");
                try {
                    while (in.hasNext()) {
                        out.println(in.next().toLowerCase());
                        try {
                            out.close();
                            in.close();
                        } catch (IllegalStateException e) {
                            System.out.println("File isn't closed");
                        }
                    }
                } catch (NoSuchElementException e) {
                    System.out.println("No Such Element Exception");
                } catch (IllegalStateException e) {
                    System.out.println("Illegal State Exception");
                }
            } catch (FileNotFoundException e) {
                System.out.println("File Not Found Exception");
            }
        } catch (IOException e) {
            System.out.println("IO Exception");
        }


    }


}
