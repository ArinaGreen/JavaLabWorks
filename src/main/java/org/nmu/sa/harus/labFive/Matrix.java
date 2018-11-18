package org.nmu.sa.harus.labFive;

import java.util.List;
import java.util.Objects;

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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Matrix matrix = (Matrix) o;
		return saveNumberRows == matrix.saveNumberRows &&
				saveNumberColumns == matrix.saveNumberColumns &&
				saveMaxElem == matrix.saveMaxElem &&
				saveMinElem == matrix.saveMinElem &&
				saveSumElem == matrix.saveSumElem &&
				Objects.equals(saveMatrix, matrix.saveMatrix);
	}

	@Override
	public int hashCode() {
		return Objects.hash(saveMatrix, saveNumberRows, saveNumberColumns, saveMaxElem, saveMinElem, saveSumElem);
	}
}
