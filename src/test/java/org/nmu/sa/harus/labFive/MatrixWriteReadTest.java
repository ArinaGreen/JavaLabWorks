    package org.nmu.sa.harus.labFive;

import org.junit.Before;
import org.junit.Test;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.*;

public class MatrixWriteReadTest {

    public static Matrix classMatrix = new Matrix();
    public static MatrixManager mm = new MatrixManager();
    public static MatrixWriteRead writeReadJSON = new MatrixWriteRead();

    @Before
    public void first() throws IOException {
        classMatrix.setMatrix(mm.createMatrix(5, 5));
        classMatrix.setNumberRows(3);
        classMatrix.setNumberColumns(3);
        classMatrix.setMaxElement(mm.maxElement(classMatrix));
        classMatrix.setMinElement(mm.minElement(classMatrix));
        classMatrix.setSumElements(mm.sum(classMatrix));

        writeReadJSON.writeJSONFile(classMatrix, "labFive.txt");
    }

    @Test
    public void writeJSONFile() throws IOException {
        assertTrue(writeReadJSON.writeJSONFile(classMatrix, "labFive.txt"), true);
    }

    @Test
    public void readJSONFile() throws IOException {
        assertEquals(writeReadJSON.readJSONFile(classMatrix, "labFive.txt"), classMatrix);
    }


}