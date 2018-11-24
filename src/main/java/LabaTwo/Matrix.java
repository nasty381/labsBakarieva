package LabaTwo;

public class Matrix {
    private int colonCount;
    private int rowCount;
    private int matrix[][];

    public int getColonCount() {
        return colonCount;
    }

    public void setColonCount(int colonCount) {
        this.colonCount = colonCount;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
}
