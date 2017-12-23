package com.task.chapter10.task9;

import java.util.concurrent.atomic.LongAccumulator;

public class Main {

    public static void main(String[] args) {
        LongAccumulator accumulatorMax = new LongAccumulator(Long::max, 0);
        accumulatorMax.accumulate(10L);
        accumulatorMax.accumulate(100L);
        accumulatorMax.accumulate(5L);
        System.out.println("Max: " + accumulatorMax.get());
        LongAccumulator accumulatorMin = new LongAccumulator(Long::min, 1000);
        accumulatorMin.accumulate(10L);
        accumulatorMin.accumulate(100L);
        accumulatorMin.accumulate(5L);
        System.out.println("Min: " + accumulatorMin.get());

    }
}