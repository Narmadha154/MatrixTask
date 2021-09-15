package com.company.matrix;

import java.util.Scanner;

public class ReplaceOne {
    public static void replaceOneByZero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the no.of cols:");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("enter the matrix elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int maxCount = 0, k = 0;
        for (int i = 0; i < row; i++) {
            int count = 0;
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                k = i;
            }
        }
        for (int j = 0; j < col; j++) {
            matrix[k][j] = 0;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
