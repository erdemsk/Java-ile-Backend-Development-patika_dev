import java.util.Arrays;
import java.util.Scanner;
public class FindTheTransposeofaMatrix {
    /*
    Homework of Java101 Module by https://app.patika.dev/courses/java101/odev-array-transpose
    */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array, m x n");
        System.out.print("m = ? ");
        int row = input.nextInt();
        System.out.print("n = ? ");
        int column = input.nextInt();

        int[][] matrixA = new int[row][column];
        int[][] transposeOfMatrixA = new int[column][row];

        int num;

        //Ask user the enter the rows of matrix
        System.out.print("Matrix: ");
        for (int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                num = input.nextInt();
                matrixA[i][j] = num;
                transposeOfMatrixA[j][i] = num;
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrixA[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println("Transpose:");
        for (int j = 0; j < column; j++) {
            for (int i = 0; i < row; i++) {
                System.out.print(transposeOfMatrixA[j][i] + "   ");
            }
            System.out.println();
        }
    }
}
