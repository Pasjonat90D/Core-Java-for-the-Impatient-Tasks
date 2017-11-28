package com.task.chapter6.task22;

import java.util.concurrent.Callable;

public class Main {

    public static <V, T extends Throwable> V doWork(Callable<V> c, T ex) throws Throwable {
        try {
            return c.call();
        } catch (Throwable realEx) {
            throw new Throwable();
        }
    }

}
