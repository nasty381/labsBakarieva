package LabaTwo;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class MatrixManagerTest {
    private final static int ROWS_COUNT = 3;
    private final static int COLON_COUNT = 3;
    MatrixManager matrixManager;
    Matrix matrix;

    @Before
    public void init() {
        matrixManager = new MatrixManager();
        matrix = new Matrix();
        matrix.setRowCount(ROWS_COUNT);
        matrix.setColonCount(COLON_COUNT);
        int[][] matrixData = new int[ROWS_COUNT][COLON_COUNT];
        int numMatrix = 0;
        for (int i = 0; i < matrix.getRowCount(); i++) {
            for (int j = 0; j < matrix.getColonCount(); j++) {
                matrixData[i][j] = numMatrix;
                numMatrix++;
            }
        }
        matrix.setMatrix(matrixData);
    }

    @org.junit.Test
    public void findMax() {
        assertEquals(8, matrixManager.findMax(matrix));
    }

    @org.junit.Test
    public void findMin() {
        assertEquals(0, matrixManager.findMin(matrix));
    }

    @org.junit.Test
    public void sumCount() {
        int sumMatrix = matrixManager.sumCount(matrix);
        assertEquals(36, sumMatrix);

    }
}