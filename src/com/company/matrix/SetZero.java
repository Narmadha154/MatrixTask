package com.company.matrix;

import java.util.Scanner;

public class SetZero {
    public static void setAllZero() {
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
        int [] rowMat=new int[row];
        int [] colMat=new int[col];
        for(int i=0;i<row;i++){
            rowMat[i]=1;
        }
        for(int i=0;i<col;i++){
            colMat[i]=1;
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0) {
                    rowMat[i]=0;
                    colMat[j]=0;
                }
            }
        }
         for (int i = 0; i < col; i++) {
                for (int j = 0; j < row; j++) {
                    if(rowMat[i]==0||colMat[j]==0){
                        matrix[i][j]=0;
                    }
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
