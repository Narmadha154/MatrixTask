package com.company.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class SortDiagonal {
    public static void sortDia() {
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
        int k=0;
        int [] arr=new int[row];
      /*  for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    arr[k++]=matrix[i][j];
                }
            }
        }
        Arrays.sort(arr);
        k=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    matrix[i][j]=arr[k++];
                }
            }
        }*/
        for(int i=0;i<row;i++){
            arr[k++]=matrix[i][i];
        }
        Arrays.sort(arr);
        k=0;
        for(int i=0;i<row;i++){
            matrix[i][i]=arr[k++];
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
