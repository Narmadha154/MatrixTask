package com.company.matrix;

import java.util.Scanner;

public class Rotate90Anti {
    public static void rotate() {
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
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
       /*for(int i=matrix.length-1;i>=0;i--){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }*/
        for(int i=0;i<row;i++){
            int k=row-1;
            for(int j=0;j<k;j++){
                int temp=matrix[j][i];
                matrix[j][i]=matrix[k][i];
                matrix[k][i]=temp;
                k--;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
