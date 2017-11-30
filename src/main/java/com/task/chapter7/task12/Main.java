package com.task.chapter7.task12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String line = "The rivalries of the two powers were concluded after a last and indecisive war by the treaty";
        List<String> words = new ArrayList<>(Arrays.asList(line.split(" ")));
        words.set(0,words.get(0).toLowerCase());
        Collections.shuffle(words);
        String last = words.get(0);
        last = last.substring(0,1).toUpperCase() + last.substring(1);
        words.set(0,last);
        words.add(".");
        words.stream().forEach(s -> System.out.print(" "+s+" "));
    }
}
