package com.task.chapter8.task11;

import java.util.stream.Stream;

public class Main {


    public static <T> boolean isFinite(Stream<T> stream) {
        return stream.findFirst().isPresent();
    }

}
