package com.task.chapter3.task13;

public class Print implements Runnable {

    private static int i=0;

    @Override
    public void run() {
        System.out.println("Welcome "+i);
        i++;
    }
}
