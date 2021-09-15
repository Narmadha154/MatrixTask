package com.company.matrix;

import java.util.Scanner;

public class SumOfMatrix {

    public static void sum() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int row=sc.nextInt();
        System.out.println("Enter the no.of cols:");
        int col=sc.nextInt();
        int [] [] mat=new int[row][col];
        System.out.println("enter the matrix elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum=sum+mat[i][j];
            }
        }
        System.out.println(sum);
    }
}
