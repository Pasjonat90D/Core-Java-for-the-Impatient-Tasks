package com.task.chapter8.task6;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("isAlphabetic =" + isAlphabetic("what"));
        System.out.println("isAlphabetic =" + isAlphabetic("what1"));
        System.out.println("isJavaIdentifier =" + isJavaIdentifier("what"));
        System.out.println("isJavaIdentifier =" + isJavaIdentifier("what/"));
    }

    private static boolean isAlphabetic(String word) {
        long count = Arrays.stream(word.split("")).filter(s ->
                Character.isAlphabetic(s.codePoints().findAny().getAsInt())).count();
        return count == word.length();
    }

    private static boolean isJavaIdentifier(String word) {
        long count = Arrays.stream(word.split("")).filter(s ->
                Character.isJavaIdentifierPart(s.codePoints().findAny().getAsInt())).count();
        return count == word.length();
    }

}
