package com.task.chapter6.task23;

import java.util.concurrent.Callable;

public class Main {

    @SuppressWarnings("unchecked")
    private static <T extends Throwable>
    void throwAs(Throwable e) throws T {
        throw (T) e;
    }
    public static <V> V doWork(Callable<V> c) {
        try {
            return c.call();
        } catch (Throwable ex) {
            Main.<RuntimeException>throwAs(ex);
            return null;
        }
    }

}
