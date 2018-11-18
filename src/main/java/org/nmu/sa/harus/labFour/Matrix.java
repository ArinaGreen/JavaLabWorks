package org.nmu.sa.harus.labFour;

import java.util.ArrayList;
import java.util.List;

public class Matrix {
	private List<List<Integer>> saveMatrix;
	private int saveNumberRows;
	private int saveNumberColumns;
	private int saveMaxElem;
	private int saveMinElem;
	private int saveSumElem;

	public int getNumberRows() {
		return saveNumberRows;
	}

	public int getNumberColums() {
		return saveNumberColumns;
	}

	public List<List<Integer>> getMatrix() {
		return saveMatrix;
	}

	public int getMaxElement() {
		return saveMaxElem;
	}

	public int getMinElement() {
		return saveMinElem;
	}

	public int getSumElements() {
		return saveSumElem;
	}

	public void setMatrix(List<List<Integer>> matrix) {
		saveMatrix = matrix;
	}

	public void setNumberRows(int rows) {
		saveNumberRows = rows;
	}

	public void setNumberColumns(int columns) {
		saveNumberColumns = columns;
	}
	public void setSumElements(int sum)
	{
		saveSumElem = sum;
	}
	public void setMinElement(int min)
	{
		saveMinElem = min;
	}
	public void setMaxElement(int max)
	{
		saveMaxElem = max;
	}
}
