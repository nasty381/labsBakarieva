package LabaOne;

public class LabaOne {

   public static final int RAND = 30;

    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int max, min;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * RAND);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];

            }
        }
        System.out.println("Сумма чисел массива равна:" + sum);
        int maximum = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (maximum < matrix[i][j])
                    maximum = matrix[i][j];
            }
        }
        System.out.println("Максимальный элемент массива:" + maximum);

        int minimum = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (minimum > matrix[i][j])
                    minimum = matrix[i][j];
            }

        }
        System.out.println("Минимальный элемент массива:" + minimum);
    }
}
