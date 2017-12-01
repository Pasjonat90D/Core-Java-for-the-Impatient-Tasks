package com.task.chapter8.task4;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 48);
        Stream<Long> longStream = prng(a, c, m);
        longStream.limit(10).forEach(aLong -> System.out.println(aLong));
    }

    //PRNG - Pseudo-Random Number Generator
    public static Stream<Long> prng(long a, long c, long m) {
        return Stream.iterate(0L, t -> (t * a + c) % m);

    }

}
