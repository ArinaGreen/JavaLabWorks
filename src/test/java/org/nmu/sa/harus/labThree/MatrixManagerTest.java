package org.nmu.sa.harus.labThree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixManagerTest {
    public static Matrix massive;
    public static MatrixManager mm;

    @Before
    public void init() {
        massive = new Matrix();
        mm = new MatrixManager();

        massive.setMatrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        massive.setNumberRows(3);
        massive.setNumberColumns(3);
    }

    @Test
    public void sum() {
        //  init();
        assertEquals(45, mm.sum(massive));
    }

    @Test
    public void maxElement() {
        //init();
        assertEquals(9, mm.maxElement(massive));
    }

    @Test
    public void minElement() {
        //init();
        assertEquals(1, mm.minElement(massive));
    }
}