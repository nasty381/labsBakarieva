package LabaFive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MatrixManager {

    public Matrix createRandMatrix(int colonCount, int rowCount, int rand)throws IOException {
        Matrix matrix = new Matrix();
        matrix.setColonCount(colonCount);
        matrix.setRowCount(rowCount);
        List<List<Integer>> matrixList = new ArrayList<List<Integer>>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < matrix.getRowCount(); i++) {
            matrixList.add(new ArrayList<Integer>());
            for (int j = 0; j < matrix.getColonCount(); j++) {
                matrixList.get(i).add((int) (Math.random() * rand));
            }
        }
        matrix.setBodysMatrix(matrixList);
        return matrix;
    }

    public void printMatrix(Matrix matrix) {
        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.getRowCount(); i++, System.out.println()) {
            for (int j = 0; j < matrix.getColonCount(); j++) {
                System.out.print(matrix.getBodysMatrix().get(i).get(j) + "\t ");
            }
        }
    }

    public int findMax(Matrix matrix) {
        int max = matrix.getBodysMatrix().get(0).get(0);
        for (int i = 0; i < matrix.getRowCount(); i++) {
            for (int j = 0; j < matrix.getColonCount(); j++) {
                if (max < matrix.getBodysMatrix().get(i).get(j))
                    max = matrix.getBodysMatrix().get(i).get(j);
            }
        }
        return max;

    }

    public int findMin(Matrix matrix) {
        int min = matrix.getBodysMatrix().get(0).get(0);
        for (int i = 0; i < matrix.getRowCount(); i++) {
            for (int j = 0; j < matrix.getColonCount(); j++) {
                if (min > matrix.getBodysMatrix().get(i).get(j))
                    min = matrix.getBodysMatrix().get(i).get(j);

            }
        }
        return min;
    }

    public int sumCount(Matrix matrix) {
        int sumMatrix = 0;
        for (int i = 0; i < matrix.getRowCount(); i++) {
            for (int j = 0; j < matrix.getColonCount(); j++) {
                sumMatrix += matrix.getBodysMatrix().get(i).get(j);
            }
        }
        return sumMatrix;
    }
}

