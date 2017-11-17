package com.task.chapter3.task15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class IntSequence {


    private static Random generator = new Random();
    private int low;
    private int high;

    public IntSequence randomInts(int low, int high) {
        this.high = high;
        this.low = low;
        return new RandomSequence();
    }

    class RandomSequence extends IntSequence {
        public int next() { return low + generator.nextInt(high - low + 1); }
        public boolean hasNext() { return true; }
    }

}
