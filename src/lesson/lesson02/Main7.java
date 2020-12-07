package lesson.lesson02;

import java.util.Scanner;

public class Main7
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Matrix m*n : ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] newMatrix = createMatrix(n, m);

        printMatrix(newMatrix);

    }

    static int[][] createMatrix(int size1, int size2) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[size1][size2];

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print("Enter element [" + i + "][" + j + "] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    static void printMatrix(int[][] myMatrix) {
        System.out.println("Matrix: ");
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }



}
