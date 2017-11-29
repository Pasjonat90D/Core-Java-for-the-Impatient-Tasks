package com.task.chapter7.task7;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String fileString = System.getProperty("user.dir")+"\\src\\main\\java\\com\\task\\chapter7\\task7\\txt\\words.txt";
        System.out.println(fileString);
        Map<String,Integer> wordsCount = new TreeMap<>();
        String[] tab = null;
        try(Stream<String> stream = Files.lines(Paths.get(fileString))){
            tab = stream.toArray(String[]::new);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(String item : tab){
            Integer i;
            if((i =wordsCount.get(item))!=null){
                wordsCount.put(item, i+1);
            } else{
                wordsCount.put(item,1);
            }
        }
        System.out.println(wordsCount.toString());
    }
}
