package com.task.chapter5.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Reading {

    public ArrayList<Double> readValues(String filename) throws IOException, NoSuchFieldException, NumberFormatException {
        ArrayList<Double> listOfDouble = new  ArrayList<>();
        Path filePath = Paths.get(filename);
        BufferedReader reader = Files.newBufferedReader(filePath);
        String line = reader.readLine();
        Double doubleFromLine = Double.parseDouble(line);
        listOfDouble.add(doubleFromLine);
        return listOfDouble;
    }


    public double sumOfValues(String filename) throws IOException, NoSuchFieldException, NumberFormatException {
        ArrayList<Double> listOfDouble = readValues(filename);
        Double sum = new Double(0);
        sum = listOfDouble.stream().mapToDouble(value -> value).sum();
        return sum;
    }


}
