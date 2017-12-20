package com.task.chapter10.task4;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Matrix[] matrixs = {new Matrix(), new Matrix(), new Matrix(), new Matrix()};
        Arrays.parallelPrefix(matrixs, (matrix, matrix2) -> matrix.plus(matrix2));
        Arrays.stream(matrixs).forEach(matrix -> System.out.println(matrix.print() + " "));

    }

}
