package org.nmu.sa.harus.labFive;

import java.io.IOException;

public class Main {
	public static int NumberRow = 5;
	public static int NumberCol = 5;

	public static void main(String[] args) throws IOException {
		MatrixManager mm = new MatrixManager();
		Matrix classMatrix = new Matrix();
		MatrixWriteRead arrayWriteRead = new MatrixWriteRead();
		classMatrix.setMatrix(mm.createMatrix(NumberRow, NumberCol));
		classMatrix.setNumberRows(NumberRow);
		classMatrix.setNumberColumns(NumberCol);
		classMatrix.setMaxElement(mm.maxElement(classMatrix));
		classMatrix.setMinElement(mm.minElement(classMatrix));
		classMatrix.setSumElements(mm.sum(classMatrix));

		System.out.println("max: " + classMatrix.getMaxElement());
		System.out.println("min: " + classMatrix.getMinElement());
		System.out.println("sum: " + classMatrix.getSumElements());
		System.out.println("mass:  ");
		mm.print(classMatrix);

		arrayWriteRead.writeJSONFile(classMatrix, "dataJson.txt");
		classMatrix = arrayWriteRead.readJSONFile(classMatrix, "dataJson.txt");
	}
}
