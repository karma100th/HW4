package task6;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static task5.SumMatrix.subtractMatrix;
import static task5.SumMatrix.sumMatrix;

public class SumMatrixFile {
    public static final int NUMBER_FOR_DIVIDE_MATRIX = 2;

    public static void main(String[] args) {
        List<String> inputLineWithMatrices;
        try {
            inputLineWithMatrices = Files.readAllLines(
                    Paths.get("C:\\Users\\vasya\\IdeaProjects\\Homework4\\src\\task6\\INPUT"),
                    StandardCharsets.UTF_8
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int numberOfLinesMatrix = splitLineToIntList(inputLineWithMatrices.get(0)).get(0);
        int numberOfColumnsMatrix = splitLineToIntList(inputLineWithMatrices.get(0)).get(1);
        int[][] matrix1 = fillMatrixFromStringList(
                new int[numberOfLinesMatrix][numberOfColumnsMatrix], inputLineWithMatrices, 1
        );
        int[][] matrix2 = fillMatrixFromStringList(
                new int[numberOfLinesMatrix][numberOfColumnsMatrix], inputLineWithMatrices,
                numberOfLinesMatrix + NUMBER_FOR_DIVIDE_MATRIX
        );
        int[][] sumMatrix = sumMatrix(matrix1, matrix2);
        int[][] subtractMatrix = subtractMatrix(matrix1, matrix2);
        System.out.println("The sum of matrices equals: \n"
                + Arrays.deepToString(sumMatrix).replace("], ", "]\n"));
        System.out.println("The subtract of matrices equals: \n"
                + Arrays.deepToString(subtractMatrix).replace("], ", "]\n"));

    }

    private static List<Integer> splitLineToIntList(String line) {
        List<Integer> integerList = new ArrayList<>();
        String[] stringLine = line.split("\\s+");
        for (String stringLineElement : stringLine) {
            integerList.add(Integer.parseInt(stringLineElement));
        }
        return integerList;
    }

    private static int[][] fillMatrixFromStringList(int[][] matrix, List<String> listNumbers, int numberStartOfArraysForMatrix) {
        for (int i = 0, j = numberStartOfArraysForMatrix; i < matrix.length; i++, j++) {
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] = splitLineToIntList(listNumbers.get(j)).get(k);
            }
        }
        return matrix;
    }

}
