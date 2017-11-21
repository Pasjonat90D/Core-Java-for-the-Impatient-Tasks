package com.task.chapter5.task1;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

public class Reading {

    public ArrayList<Double> readValues(String filename) throws IOException, NoSuchFieldException, NumberFormatException {
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
                    throw new NumberFormatException("This isn't value: " + line);
                }
            }
            } catch (NoSuchFileException ex){
            throw new NoSuchFileException("No Such File Exception");
        }
        return listOfDouble;
    }

}
