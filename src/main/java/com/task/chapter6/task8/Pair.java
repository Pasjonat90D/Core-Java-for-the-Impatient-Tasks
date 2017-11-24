package com.task.chapter6.task8;

public class Pair<E extends Comparable> {

    private E first;
    private E secound;

    public Pair(E first, E secound) {
        this.first = first;
        this.secound = secound;
    }

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public E getSecound() {
        return secound;
    }

    public void setSecound(E secound) {
        this.secound = secound;
    }

    public E max() {
        if (first.compareTo(secound) > 0)
            return first;
        else
            return secound;

    }

    public E min() {
        if (first.compareTo(secound) < 0)
            return first;
        else
            return secound;

    }
}
