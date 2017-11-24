package com.task.chapter5.task13;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Filter;
import java.util.logging.Logger;

public class Main {


    public static void main(String[] args) {
        Logger.getGlobal().info("Logger");
        Logger.getGlobal().setFilter(filter());
        Logger.getGlobal().info("cos");
        Logger.getGlobal().info("c++");
        Logger.getGlobal().info("C++");

    }

    public static Filter filter() {
        ///////ugly words
        List<String> uglyWord = new ArrayList<>();
        uglyWord.add("c++");
        uglyWord.add("sex");
        uglyWord.add("drags");
        ///ugly Words
        return (record) -> !uglyWord.stream().filter(s -> s.equalsIgnoreCase(record.getMessage())).findFirst().isPresent();
    }



}
