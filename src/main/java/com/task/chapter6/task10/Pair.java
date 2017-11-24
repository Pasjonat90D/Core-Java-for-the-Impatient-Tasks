package com.task.chapter6.task10;

public class Pair<E extends Comparable> {

    private E first;
    private E second;

    public Pair(E first, E secound) {
        this.first = first;
        this.second = secound;
    }

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public E getSecond() {
        return second;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    public E max() {
        if (first.compareTo(second) > 0)
            return first;
        else
            return second;

    }

    public E min() {
        if (first.compareTo(second) < 0)
            return first;
        else
            return second;
    }
}
