package com.company.matrix;

import java.util.Scanner;

public class UniqueRows {
    public static void findUniqueRows() {
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
       /* for(int i=0;i<row;i++){
            int j=0, count=0;
            while(j<col&&(matrix[i][j]!=matrix[i+1][j])){
                count++;
                j++;
            }
            if(count==row){
                int k=i;
                for(int l=0;l<col;l++){
                    System.out.print(matrix[k][l]+"\t");
                }
                System.out.print("$");
            }
        }*/
        for(int i=0;i<row;i++){
            int flag=0;
            for(int j=0;j<i;j++){
                flag=1;
                for(int k=0;k<col;k++){
                    if(matrix[i][k]!=matrix[j][k]){
                        flag=0;
                    }
                }
                if(flag==1){
                    break;
                }
            }
            if(flag==0){
                for(int j=0;j<col;j++){
                    System.out.print(matrix[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }
}
