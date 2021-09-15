package com.company.matrix;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the program number:");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                SumOfMatrix sum = new SumOfMatrix();
                sum.sum();
                break;
            case 2:
                Rotate90Anti rotate = new Rotate90Anti();
                rotate.rotate();
                break;
            case 3:
                Transpose trans = new Transpose();
                trans.transposeMat();
                break;
            case 4:
                UniqueRows unique = new UniqueRows();
                unique.findUniqueRows();
                break;
            case 5:
                ReplaceOne replace = new ReplaceOne();
                replace.replaceOneByZero();
                break;
            case 6:
                SetZero set = new SetZero();
                set.setAllZero();
                break;
            case 7:
                SortDiagonal sort = new SortDiagonal();
                sort.sortDia();
                break;
            case 9:
                Rectangle max = new Rectangle();
                max.findRecArea();
                break;
            case 10:
                MatrixGame game = new MatrixGame();
                int res=game.rotate();
                System.out.println(res);
                break;
            case 11:
                Check2D check = new Check2D();
                check.checkString();
                break;
            default:
                System.out.println("no program");
        }
    }
}
