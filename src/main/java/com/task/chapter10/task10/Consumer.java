package com.task.chapter10.task10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Consumer implements Runnable {

    private BlockingQueue<Path> blockingQueue = null;
    private String word = null;

    public Consumer(BlockingQueue blockingQueue, String word) {
        this.blockingQueue = blockingQueue;
        this.word = word;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            final int j = i;
            new Thread(() -> {
                try {
                    Path nullPath = Paths.get("null");
                    while (true) {

                        Path p = blockingQueue.poll(100, TimeUnit.MICROSECONDS);
                        if (p == null || p.equals(nullPath)) {
                            break;
                        }
                        try (Stream<String> stream = Files.lines(p)) {
                            stream.filter(s -> s.matches("(.*)" + word + "(.*)")).forEach(System.out::println);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Consumer(" + j + "): " + p);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
