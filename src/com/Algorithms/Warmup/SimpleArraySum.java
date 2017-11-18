package com.Algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by MacUser on 16/11/17.
 */
public class SimpleArraySum {

    public static void main(String args[]) {
        Scanner readConsole = new Scanner(System.in);
        int firstArrayNumber = readConsole.nextInt();
        int[] sumArray = new int[firstArrayNumber];
        for (int i = 0; i < firstArrayNumber; i++) {
            sumArray[i] = readConsole.nextInt();
        }
        readConsole.close();
        System.out.println(simpleArraySum(sumArray));

    }

    static int simpleArraySum(int arrayIndex[]){
        int totalArraySum=0;
        for(int number : arrayIndex) {
            totalArraySum+=number;
        }
        return totalArraySum;
    }

}
