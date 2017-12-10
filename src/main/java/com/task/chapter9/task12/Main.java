package com.task.chapter9.task12;

public class Main {

    public static void main(String[] args) {
        String result = "3:46".replaceAll("(\\d{1,2}):(\\d{2})", "$1 h $2 m");
        System.out.print(result);
    }

}
