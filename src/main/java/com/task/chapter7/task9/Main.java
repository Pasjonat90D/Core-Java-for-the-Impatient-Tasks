package com.task.chapter7.task9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String fileString = System.getProperty("user.dir") + "\\src\\main\\java\\com\\task\\chapter7\\task8\\txt\\words.txt";
        List<String> listWords = new ArrayList<>();
        try(Stream<String> stream = Files.lines(Paths.get(fileString))) {
           listWords = stream.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        wordsCountMarge(listWords);
        wordsCountContains(listWords);
        wordsCountContainsGet(listWords);
        wordsCountGetOrDefault(listWords);
        wordsCountPutIfAbsent(listWords);

    }

    private static void wordsCountMarge(List<String > listWords){
        Map<String, Integer> wordsCountMarge = new TreeMap<>();
        listWords.forEach(s -> wordsCountMarge.merge(s,1,Integer::sum));
        System.out.println(wordsCountMarge.toString());
    }
    private static void wordsCountContains(List<String > listWords){
        Map<String, Integer> wordsCountContains = new TreeMap<>();
        for(String s: listWords){
            if(wordsCountContains.containsKey(s)){
                wordsCountContains.compute(s,(s1, integer) -> integer = integer+1);
            } else {
                wordsCountContains.put(s,1);
            }
        }
        System.out.println(wordsCountContains.toString());
    }
    private static void wordsCountContainsGet(List<String > listWords){
        Map<String, Integer> wordsCountContainsGet = new TreeMap<>();
        for(String s : listWords){
            Integer i = wordsCountContainsGet.get(s);
            if(i!=null){
                wordsCountContainsGet.put(s,i+1);
            } else {
                wordsCountContainsGet.put(s,1);
            }
        }
        System.out.println(wordsCountContainsGet.toString());
    }
    private static void wordsCountGetOrDefault(List<String > listWords){
        Map<String,Integer> wordsCountGetOrDefault = new TreeMap<>();
        for(String s : listWords){
            wordsCountGetOrDefault.put(s,wordsCountGetOrDefault.getOrDefault(s,0)+1);
        }
        System.out.println(wordsCountGetOrDefault.toString());

    }
    private static void wordsCountPutIfAbsent(List<String > listWords){
        Map<String,Integer> wordsCountPutIfAbsent = new TreeMap<>();
        for(String s : listWords){
            Integer i;
            if((i = wordsCountPutIfAbsent.putIfAbsent(s,1))!=null){
                wordsCountPutIfAbsent.put(s,i+1);
            }
        }
        System.out.println(wordsCountPutIfAbsent.toString());
    }

}
