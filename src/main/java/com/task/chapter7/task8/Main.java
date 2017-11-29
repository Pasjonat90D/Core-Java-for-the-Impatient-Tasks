package com.task.chapter7.task8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String fileString = System.getProperty("user.dir") + "\\src\\main\\java\\com\\task\\chapter7\\task8\\txt\\words.txt";
        Map<String, List<Integer>> occurrenceOfWord = new TreeMap<>();
        String[] tab = null;
        try(Stream<String> stream = Files.lines(Paths.get(fileString))) {
            tab = stream.toArray(String[]::new);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i=0;i<tab.length;i++){
            if(occurrenceOfWord.containsKey(tab[i])){
                occurrenceOfWord.put(tab[i],new ArrayList<>(Arrays.asList(i+1)));
            }else
                occurrenceOfWord.get(tab[i]).add(i+1);
        }
        System.out.print(occurrenceOfWord.toString());
    }
}
