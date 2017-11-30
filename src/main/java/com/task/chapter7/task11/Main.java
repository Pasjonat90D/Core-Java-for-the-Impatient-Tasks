package com.task.chapter7.task11;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args){
       String line = "The rivalries of the two powers were concluded after a last and indecisive war by the treaty";
        List<String> words = new ArrayList<>(Arrays.asList(line.split(" ")));
        words.stream().forEach(s -> System.out.print(" "+ s+" "));
        String last = words.remove(words.size()-1);
        System.out.println("\n");
        Collections.shuffle(words,new RandomFromLists(words.size()-1));
        words.add(words.size(),last);
        words.stream().forEach(s -> System.out.print(" "+ s+" "));


    }

    static class RandomFromLists extends Random{

        private int maxValue;

        public RandomFromLists(int maxValue) {
            this.maxValue = maxValue;
        }

        @Override
        public int nextInt(int bound) {
            return ThreadLocalRandom.current().nextInt(1, maxValue );
        }
    }
}
