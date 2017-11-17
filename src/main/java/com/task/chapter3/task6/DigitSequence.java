package com.task.chapter3.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DigitSequence implements Iterator<Integer> {

    private List<Integer> list = new ArrayList<>();
    private int iteratorPosition=0;

    public DigitSequence(int[] tab){
        Arrays.stream(tab).forEach( i -> list.add(i));
    }

    @Override
    public boolean hasNext() {
            return iteratorPosition<list.size();
    }

    @Override
    public Integer next() {
        Integer i = new Integer(list.get(iteratorPosition));
        iteratorPosition++;
        return i;
    }

    @Override
    public void remove() {
    }
}
