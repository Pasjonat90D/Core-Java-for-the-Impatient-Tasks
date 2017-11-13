package com.task.chapter1.task13;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        //test loop
        for (int j = 0; j < 150; j++) {
           lotto();

        }
    }


    public static void lotto(){
        int[] tab = new int[6];
        ArrayList<Integer> allNumbers = new ArrayList<>(49);
        for (int i = 0; i < 49; i++) {
            allNumbers.add(i + 1);
        }
        for (int numberOfLoop = 0; numberOfLoop < 6; numberOfLoop++) {
            int randomNum = ThreadLocalRandom.current().nextInt(1, (48 + 1) - numberOfLoop);
            tab[numberOfLoop] = randomNum;
            allNumbers.remove(randomNum);
        }
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));
    }

}
