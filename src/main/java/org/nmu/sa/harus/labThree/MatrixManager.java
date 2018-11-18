package org.nmu.sa.harus.labThree;

import java.util.Random;

public class MatrixManager {
    public static final int MAX_RANDOM_VALUE = 20;
    public static int NumberRow = 5;
    public static int NumberCol = 5;

    public static void main(String[] args) {
        MatrixManager mm = new MatrixManager();
        Matrix classMatrix = new Matrix();
        classMatrix.setMatrix(mm.createMatrix(NumberRow, NumberCol));
        classMatrix.setNumberRows(NumberRow);
        classMatrix.setNumberColumns(NumberCol);
        classMatrix.setMaxElement(mm.maxElement(classMatrix));
        classMatrix.setMinElement(mm.minElement(classMatrix));
        classMatrix.setSumElements(mm.sum(classMatrix));
        // ***

        System.out.println("max: " + classMatrix.getMaxElement());
        System.out.println("min: " + classMatrix.getMinElement());
        System.out.println("sum: " + classMatrix.getSumElements());
        System.out.println("mass:  ");
        mm.print(classMatrix);
    }

    public int[][] createMatrix(int rowsCount, int columnsCount) {
        int[][] matrix = new int[rowsCount][columnsCount];
        Random ForRandomElements = new Random();
        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                matrix[i][j] = ForRandomElements.nextInt(2 * MAX_RANDOM_VALUE) - MAX_RANDOM_VALUE;
            }
        }
        return matrix;
    }

    public int sum(Matrix matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.getNumberRows(); i++) {
            for (int j = 0; j < matrix.getNumberColums(); j++) {
                sum += matrix.getMatrix()[i][j];
            }
        }
        return sum;
    }

    public int maxElement(Matrix matrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.getNumberRows(); i++) {
            for (int j = 0; j < matrix.getNumberColums(); j++) {
                if (max < matrix.getMatrix()[i][j]) {
                    max = matrix.getMatrix()[i][j];
                    ;
                }
            }
        }
        return max;
    }

    public int minElement(Matrix matrix) {
        int min = matrix.getMatrix()[0][0];
        for (int i = 0; i < matrix.getNumberRows(); i++) {
            for (int j = 0; j < matrix.getNumberColums(); j++) {
                if (min > matrix.getMatrix()[i][j]) {
                    min = matrix.getMatrix()[i][j];
                    ;
                }
            }
        }
        return min;
    }

    public void print(Matrix matrix) {
        for (int i = 0; i < matrix.getNumberRows(); i++) {
            for (int j = 0; j < matrix.getNumberColums(); j++) {
                System.out.print(matrix.getMatrix()[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
