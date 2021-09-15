package com.company.matrix;

import java.util.Scanner;
import java.util.Stack;

public class Rectangle {
    public static int largestRectArea(int [] height){
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int maxArea=0;
        for(int i=0;i<=height.length;i++){
            int val=i==height.length?0:height[i];
            while(stack.peek()!=-1&&height[stack.peek()]>=val){
                int right=i;
                int high=height[stack.pop()];
                int left=stack.peek();
                maxArea=Math.max(maxArea,high*(right-left-1));
            }
            stack.push(i);
        }
        return maxArea;
    }
    public static void  findRecArea() {
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
        int [] height=new int[col];
        for(int i=0;i<col;i++){
            height[i]=mat[0][i];
        }
        int area=largestRectArea(height);
        for(int i=1;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==1){
                    height[j]++;
                }
                else{
                    height[j]=0;
                }
            }
        }
        area=Math.max(area,largestRectArea(height));
        System.out.println(area);
    }
}
