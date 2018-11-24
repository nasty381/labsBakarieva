package LabaTwo;

public class MatrixManager {
    public Matrix createRandMatrix(int colonCount, int rowCount, int rand) {
        Matrix matrix = new Matrix();
        matrix.setColonCount(colonCount);
        matrix.setRowCount(rowCount);
        matrix.setMatrix(new int[rowCount][colonCount]);
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colonCount; j++) {
                matrix.getMatrix()[i][j] = (int) (Math.random() * rand);
            }
        }
        return matrix;
    }

    public void printMatrix(Matrix matrix) {
        int rowCount = matrix.getRowCount();
        int colonCount = matrix.getColonCount();
        System.out.println("Matrix: ");
        for (int i = 0; i < rowCount; i++, System.out.println()) {
            for (int j = 0; j < colonCount; j++) {
                System.out.print(matrix.getMatrix()[i][j] + "\t ");
            }
        }
    }

    public int findMax(Matrix matrix) {
        int max = matrix.getMatrix()[0][0];
        for (int i = 0; i < matrix.getRowCount(); i++) {
            for (int j = 0; j < matrix.getColonCount(); j++) {
                if (max < matrix.getMatrix()[i][j])
                    max = matrix.getMatrix()[i][j];
            }
        }
        return max;

    }

    public int findMin(Matrix matrix) {
        int min = matrix.getMatrix()[0][0];
        for (int i = 0; i < matrix.getRowCount(); i++) {
            for (int j = 0; j < matrix.getColonCount(); j++) {
                if (min > matrix.getMatrix()[i][j])
                    min = matrix.getMatrix()[i][j];

            }
        }
        return min;
    }

    public int sumCount(Matrix matrix) {
        int sumMatrix = 0;
        for (int i = 0; i < matrix.getRowCount(); i++) {
            for (int j = 0; j < matrix.getColonCount(); j++) {
                sumMatrix += matrix.getMatrix()[i][j];
            }
        }
        return sumMatrix;
    }
}