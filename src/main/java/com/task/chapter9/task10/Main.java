package com.task.chapter9.task10;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String textEntered = "2 -25.7 800 s v";
        ArrayList<Double> findList = find(textEntered);
        ArrayList<Double> splitList = split(textEntered);
        findList.forEach(System.out::println);
        splitList.forEach(System.out::println);
    }

    private static ArrayList<Double> split(String text) {
        String[] tab = text.split(" ");
        ArrayList<Double> list = new ArrayList<>();
        for (String s : tab) {
            if (NumberUtils.isNumber(s)) {
                list.add(Double.parseDouble(s));
            }
        }
        return list;
    }

    private static ArrayList<Double> find(String text) {
        ArrayList<Double> list = new ArrayList<>();
        Matcher m = Pattern.compile("(-?)((\\d+.\\d+))|(\\d+)").matcher(text);
        while (m.find()) {
            double d = Double.parseDouble(m.group(0));
            list.add(d);
        }
        return list;
    }

}
