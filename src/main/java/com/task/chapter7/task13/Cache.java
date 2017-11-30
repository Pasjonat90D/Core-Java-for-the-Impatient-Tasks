package com.task.chapter7.task13;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cache extends LinkedHashMap {

    private int size;

    public Cache(int initialCapacity) {
        super(initialCapacity);
        this.size = initialCapacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return super.size()>size;
    }
}
