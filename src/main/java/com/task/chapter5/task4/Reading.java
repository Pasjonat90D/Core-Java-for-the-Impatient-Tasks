package com.task.chapter5.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Reading {

    public ArrayList<Double> readValues(String filename) {
        ArrayList<Double> listOfDouble = new  ArrayList<>();
        Path filePath = Paths.get(filename);
        try{
            BufferedReader reader = Files.newBufferedReader(filePath);
            while (reader.readLine()!=null) {
                String line = reader.readLine();
                try {
                    Double doubleFromLine = Double.parseDouble(line);
                    listOfDouble.add(doubleFromLine);
                } catch (NumberFormatException nfe) {
                    System.out.println("Error 03");
                }
            }
        } catch (NoSuchFileException ex){
            System.out.println("Error 04");
        } catch (IOException e) {
            System.out.println("Error 02");
        }
        return listOfDouble;
    }


    public double sumOfValues(String filename) {
        ArrayList<Double> listOfDouble = readValues(filename);
        Double sum = new Double(0);
        sum = listOfDouble.stream().mapToDouble(value -> value).sum();
        return sum;
    }


}
