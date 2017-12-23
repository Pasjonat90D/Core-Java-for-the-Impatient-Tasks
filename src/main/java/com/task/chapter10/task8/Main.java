package com.task.chapter10.task8;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        AtomicLong atomicLong = new AtomicLong(1);
        long startTimeAtomicLong = System.currentTimeMillis();
        for (int i = 1; i <= 1000; i++) {
            new Thread(() -> {
                for (int j = 1; j <= 100000; j++) {
                    atomicLong.incrementAndGet();
                    if (atomicLong.get() == 100000000L) {
                        System.out.println("Value :" + atomicLong.get() + "\n Time: " + (System.currentTimeMillis() - startTimeAtomicLong));

                    }
                }
            }).start();
        }
        LongAdder longAdder = new LongAdder();
        longAdder.increment();
        long startLongAdder = System.currentTimeMillis();
        for (int i = 1; i <= 1000; i++) {
            new Thread(() -> {
                for (int j = 1; j <= 100000; j++) {
                    longAdder.increment();
                    long sum = longAdder.sum();
                    if (sum == 100000000L) {
                        System.out.println("Value :" + sum + "\n Time: " + (System.currentTimeMillis() - startLongAdder));

                    }
                }
            }).start();
        }
    }
}
