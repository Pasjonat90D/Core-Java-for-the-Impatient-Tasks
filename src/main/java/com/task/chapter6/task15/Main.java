package com.task.chapter6.task15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Main {

        public static <R,T> ArrayList<R> map(ArrayList<T> list, Function<T, R> function) {
        ArrayList<R> result = new ArrayList<>();
        for (T element : list) {
            result.add(function.apply(element));
        }
        return result;
    }



}
