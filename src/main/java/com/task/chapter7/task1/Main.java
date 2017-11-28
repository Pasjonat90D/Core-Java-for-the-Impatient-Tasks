package com.task.chapter7.task1;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        System.out.println("HashSet:");
        Set<Integer> sieve = sieveOfEratosthenes(20);
        sieve.stream().forEach(System.out::println);
        System.out.println("BitSet:");
        BitSet sieveBitSet = sieveOfEratosthenesBitSet(20);
        sieveBitSet.stream().forEach(System.out::println);
    }

    private static Set<Integer> sieveOfEratosthenes(int range) {
        Set<Integer> sieve = new HashSet<>(range);
        for (int i = 2; i < range; i++) {
            sieve.add(i);
        }
        for (int j = 0; j < range; j++) {
            for (int i = 2; i < range; i ++) {
                sieve.remove(i*(i+j));
            }
        }
        return sieve;
    }
    private static BitSet sieveOfEratosthenesBitSet(int range) {
        BitSet sieve = new BitSet(range);
        for (int i = 2; i < range; i++) {
            sieve.set(i);
        }
        for (int j = 0; j < range; j++) {
            for (int i = 2; i < range; i ++) {
                sieve.clear(i*(i+j));
            }
        }
        return sieve;
    }

}
