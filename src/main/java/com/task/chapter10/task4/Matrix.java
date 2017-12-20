package com.task.chapter10.task4;

public class Matrix {

    private int[][] tab = {{1, 1}, {1, 0}};


    public Matrix(int[][] tab) {
        this.tab = tab;
    }

    public Matrix() {
    }

    public Matrix plus(Matrix matrix) {
        int[][] newTab = {{matrix.tab[0][0] * tab[0][0] + matrix.tab[0][1] * tab[1][0],
                matrix.tab[0][0] * tab[1][0] + matrix.tab[0][1] * tab[1][1]},
                {matrix.tab[1][0] * tab[0][0] + matrix.tab[1][1] * tab[1][0],
                        matrix.tab[1][0] * tab[0][1] + matrix.tab[1][1] * tab[1][1]}};
        return new Matrix(newTab);
    }

    public int print() {
        return tab[0][0];
    }


}
