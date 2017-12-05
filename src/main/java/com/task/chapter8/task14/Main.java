package com.task.chapter8.task14;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        double average = Stream.of(1d, 2d, 3d, 4d, 5d).mapToDouble(value -> value).average().orElse(Double.NaN);
        double average1 = Stream.of(1d, 2d, 3d, 4d, 5d).reduce((aDouble, aDouble2) -> aDouble + aDouble2).orElse(Double.NaN);
        double average10 = average123(Stream.of(1d, 2d, 3d, 4d, 5d));
        System.out.print(average10);
    }

    public static Double average123(Stream<Double> stream) {
        return Stream.concat(stream, Stream.of()).reduce((aDouble, aDouble2) -> aDouble + aDouble2).
                map(aDouble -> aDouble / stream.count()).orElse(Double.NaN);
    }

}
