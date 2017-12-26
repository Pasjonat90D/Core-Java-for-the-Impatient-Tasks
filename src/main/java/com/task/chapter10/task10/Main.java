package com.task.chapter10.task10;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) {
        BlockingQueue blockingQueue = new ArrayBlockingQueue(3);
        String pathFiles = System.getProperty("user.dir") + "\\src\\main\\java\\com\\task\\chapter1";
        String word = "System";
        Producer producer = new Producer(blockingQueue, pathFiles);
        Consumer consumer = new Consumer(blockingQueue, word);

        new Thread(producer).start();
        new Thread(consumer).start();
    }


}
