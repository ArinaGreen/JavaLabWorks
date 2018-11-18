package org.nmu.sa.harus.labFour;

public class Main {
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

        System.out.println("max: " + classMatrix.getMaxElement());
        System.out.println("min: " + classMatrix.getMinElement());
        System.out.println("sum: " + classMatrix.getSumElements());
        System.out.println("mass:  ");
        mm.print(classMatrix);
    }

}
