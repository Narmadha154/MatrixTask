package com.company.matrix;

import java.util.Scanner;

public class MatrixGame {
    public static int rotate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the no.of cols:");
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("enter the matrix elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the no.of rotation:");
        int x = sc.nextInt();
        int [][] newMat=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                newMat[i][j]=mat[i][j];
            }
        }
        for(int i=0;i<row;i++){
            if(i%2==0){
                for(int k=0;k<x;k++){
                    int temp=newMat[i][0];
                    for(int j=0;j<col-1;j++){
                        newMat[i][j]=newMat[i][j+1];
                    }
                    newMat[i][col-1]=temp;
                }
            }
            else{
                for(int k=0;k<x;k++){
                    int temp=newMat[i][col-1];
                    for(int j=col-1;j>0;j--){
                        newMat[i][j]=newMat[i][j-1];
                    }
                    newMat[i][0]=temp;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(newMat[i][j]!=mat[i][j]){
                    return 0;
                }
            }
        }
        return 1;
    }
}
