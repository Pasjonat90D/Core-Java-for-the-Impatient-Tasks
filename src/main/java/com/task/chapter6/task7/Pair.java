package com.task.chapter6.task7;

public class Pair<E> {

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
}
