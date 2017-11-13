package com.task.chapter1.task14;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int[][] tab = readTab();
        //sample tables
//        int[][] testTab1 = {{1, 2, 3}, {5, 4, 3}, {9, 8, 7}};
//        int[][] testTab2 = {{1, 2, 3}, {5, 4, 3}, {5, 4, 3}};
//        int[][] testTabPass = {{8,1,6}, {3,5,7}, {4,9,2}};
        boolean result = isMagicSquare(tab);
        System.out.print("Is square magic? " + result);
    }

    private static int[][] readTab() {
        Scanner in = new Scanner(System.in);
        System.out.println("Tab= ");
        ArrayList<String> stringTab = new ArrayList<>();
        String line=null;
        int size =0;
        while (!(line = in.nextLine()).isEmpty()){
            stringTab.add(line);
            size++;
        }
        int[][] result = new int[size][size];
        int i=0,j =0;
        for(String lineArray : stringTab){
            String[] parts = lineArray.split(" ");
            for(String part : parts){
                result[i][j] = Integer.parseInt(part);
                j++;
            }
            j=0;
            i++;
        }
        return result;
    }

    private static boolean isMagicSquare(int[][] tab) {
        final int lengthTab = tab.length;
        Integer sum = 0;
        boolean result = true;
        int sumDiagonal = 0;
        for (int i = 0; i < lengthTab; i++) {
            int sumColumn = 0;
            int sumRow = 0;
            for (int j = 0; j <lengthTab; j++) {
                sumColumn = sumColumn + tab[i][j];
                sumRow = sumRow + tab[j][i];
                if(i==j){
                    sumDiagonal = sumDiagonal + tab[i][j];
                }
            }
            if (i == 0) {
                sum = sumColumn;
                if(sum!=sumRow)
                    return false;
            } else {
                if (sum != sumColumn || sum !=sumRow ) {
                    return false;
                }
            }
        }
        if(sum!=sumDiagonal)
            return false;

        int sumDiagonalBack = 0;
        for(int i=0, j = lengthTab-1;i<lengthTab;i++,j--) {
                sumDiagonalBack = sumDiagonalBack + tab[i][j];
        }
        if(sum!=sumDiagonalBack)
            return false;

        return result;
    }

}
