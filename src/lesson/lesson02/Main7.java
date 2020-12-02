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

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter element [" + i + "][" + j + "] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }







    }



}
