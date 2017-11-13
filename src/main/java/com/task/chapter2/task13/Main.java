package com.task.chapter2.task13;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


        String fileName = System.getProperty("user.dir") + "/src/main/java/com/task/chapter2/task13/csv/AssetsImportCompleteSample.csv";

        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                for (String e: nextLine) {
                    if(!e.equals(""))
                        System.out.format("%s \n", e);
                }
            }
        }
    }


}
