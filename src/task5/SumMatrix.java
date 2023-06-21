package task5;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumMatrix {
    public static void main(String[] args) throws InputMismatchException {
        System.out.println("Enter the number of columns of the two square matrices");
        Scanner scanner = new Scanner(System.in);
        int lengthMatrix = 0;
        try {
            lengthMatrix = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid value. Only numbers must be there. Try again.");
            scanner.close();
        }
        int[][] matrix1 = new int[lengthMatrix][lengthMatrix];
        int[][] matrix2 = new int[lengthMatrix][lengthMatrix];
        System.out.println("Fill matrix number 1 (A):");
        fillMatrixInputNumbers(matrix1);
        System.out.println("Fill matrix number 2 (B):");
        fillMatrixInputNumbers(matrix2);
        int[][] sumMatrix = sumMatrix(matrix1, matrix2);
        int[][] subtractMatrix = subtractMatrix(matrix1, matrix2);
        System.out.println("The sum of matrices equals: \n"
                + Arrays.deepToString(sumMatrix).replace("], ", "]\n"));
        System.out.println("The subtract of matrices equals: \n"
                + Arrays.deepToString(subtractMatrix).replace("], ", "]\n"));
    }

    private static int[][] fillMatrixInputNumbers(int[][] matrix) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Enter " + (j + 1) + " number of " + (i + 1) + " line");
                try {
                    matrix[i][j] = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid value. Only numbers must be there. Try again.");
                    sc.close();
                }

            }
        }
        return matrix;
    }

    public static int[][] sumMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] sumMatrix = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }

    public static int[][] subtractMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] subMatrix = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                subMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return subMatrix;
    }
}
