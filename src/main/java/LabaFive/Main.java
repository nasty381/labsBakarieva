package LabaFive;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)throws IOException{
        String filePath = "D:\\t.txt";
        MatrixManager matrixManager = new MatrixManager();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Matrix matrix = matrixManager.createRandMatrix(6,6,30);
        MatrixWriteReader matrixWriteRead = new MatrixWriteReader();
        matrixWriteRead.write(matrix, filePath);
        Matrix matrixFromFIle = matrixWriteRead.read(filePath);
            matrixManager.printMatrix(matrix);
            System.out.print("Maximum = " + matrixManager.findMax(matrix) + "\n");
            System.out.print("Minimum = " + matrixManager.findMin(matrix) + "\n");
            System.out.print("Sum = " + matrixManager.sumCount(matrix) + "\n");
            System.out.print("Author = " + matrix.getAuthor() + "\n");

        }
    }


