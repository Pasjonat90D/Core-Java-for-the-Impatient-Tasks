package com.task.chapter10.task10;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private BlockingQueue<Path> blockingQueue = null;
    private Path path = null;

    public Producer(BlockingQueue blockingQueue, String pathFiles) {
        this.blockingQueue = blockingQueue;
        this.path = Paths.get(pathFiles);
    }

    @Override
    public void run() {
        try {
            Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (attrs.isDirectory()) {
                        return FileVisitResult.CONTINUE;
                    }
                    try {
                        System.out.println("Producer: " + file);
                        blockingQueue.put(file);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
            blockingQueue.put(Paths.get("null"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
