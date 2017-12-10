package com.task.chapter9.task11;

public class Main {

    public static void main(String[] ags) {
        String text = "/home/cay/myFile.txt";

        String[] tab = text.split("/");

        for (String s : tab) {
            System.out.print(s + " ");
        }

    }

}
