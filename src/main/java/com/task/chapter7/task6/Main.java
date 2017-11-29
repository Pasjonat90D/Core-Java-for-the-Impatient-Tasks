package com.task.chapter7.task6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Set<Integer>> map = new HashMap<>();
        Integer[] tab = {0,1,2,3,4,5};
        map.put("1", new HashSet<>(Arrays.asList(tab)));

        map.get("1").stream().forEach(System.out::print);
    }

}
