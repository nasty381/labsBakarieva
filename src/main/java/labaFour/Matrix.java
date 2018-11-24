package labaFour;

import java.util.List;

public class Matrix {

    private int colonCount;
    private int rowCount;
    private List<List<Integer>> bodysMatrix;
    private String author = "Bakarieva A.";

    public List<List<Integer>> getBodysMatrix() {
        return bodysMatrix;
    }

    public void setBodysMatrix(List<List<Integer>> bodysMatrix) {
        this.bodysMatrix = bodysMatrix;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

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

}


