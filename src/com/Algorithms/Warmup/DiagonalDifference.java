package com.Algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by MacUser on 18/11/17.
 */
public class DiagonalDifference {

    public static void main(String args[]) {

        Scanner readConsole = new Scanner(System.in);
        int matrixDimension = readConsole.nextInt();
        int matrix[][]= new int[matrixDimension][matrixDimension];
        for(int i=0;i<=matrixDimension-1;i++) {
            for(int j=0;j<=matrixDimension-1;j++) {
                matrix[i][j]=readConsole.nextInt();
            }
        }
        readConsole.close();
        System.out.println(calculateMatrixDiagnoal(matrix));

    }

    static int calculateMatrixDiagnoal(int SquarMatrix[][]) {
        int primaryDiagnoal = 0, secondaryDiagnoal = 0,difference=0;
        for (int i = 0; i <= SquarMatrix.length - 1; i++) {
            primaryDiagnoal += SquarMatrix[i][i];
            secondaryDiagnoal += SquarMatrix[i][SquarMatrix.length - 1-i];
        }
        difference = primaryDiagnoal-secondaryDiagnoal;
        return Math.abs(difference);

    }

}
