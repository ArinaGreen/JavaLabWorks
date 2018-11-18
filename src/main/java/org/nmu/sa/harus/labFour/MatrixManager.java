package org.nmu.sa.harus.labFour;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MatrixManager {
	public static final int MAX_RANDOM_VALUE = 20;

	public List<List<Integer>> createMatrix(int rowsCount, int columnsCount) {
		List<List<Integer>> matrix = new ArrayList<List<Integer>>(rowsCount);
		Random randomVariable = new Random();
		for (int i = 0; i < rowsCount; i++) {
			matrix.add(new LinkedList<Integer>());
			for (int j = 0; j < columnsCount; j++) {
				matrix.get(i).add(randomVariable.nextInt(2 * MAX_RANDOM_VALUE) - MAX_RANDOM_VALUE);
			}
		}
		return matrix;
	}

	public int sum(Matrix matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.getNumberRows(); i++) {
			for (int j = 0; j < matrix.getNumberColums(); j++) {
				sum += matrix.getMatrix().get(i).get(j);
			}
		}
		return sum;
	}

	public int maxElement(Matrix matrix) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < matrix.getNumberRows(); i++) {
			for (int j = 0; j < matrix.getNumberColums(); j++) {
				if (max < matrix.getMatrix().get(i).get(j)) {
					max = matrix.getMatrix().get(i).get(j);
				}
			}
		}
		return max;
	}

	public int minElement(Matrix matrix) {
		int min = matrix.getMatrix().get(0).get(0);
		for (int i = 0; i < matrix.getNumberRows(); i++) {
			for (int j = 0; j < matrix.getNumberColums(); j++) {
				if (min > matrix.getMatrix().get(i).get(j)) {
					min = matrix.getMatrix().get(i).get(j);

					;
				}
			}
		}
		return min;
	}

	public void print(Matrix matrix) {
		for (int i = 0; i < matrix.getNumberRows(); i++) {
			for (int j = 0; j < matrix.getNumberColums(); j++) {
				System.out.print(matrix.getMatrix().get(i).get(j) + " ");
			}
			System.out.println("");
		}
	}
}
