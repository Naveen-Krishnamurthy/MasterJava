package com.Algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by MacUser on 18/11/17.
 */
public class AveryBigSum {

    public static void main(String[] args) {
        Scanner readConsole = new Scanner(System.in);
        int arrayLength = readConsole.nextInt();
        long sumArray[] = new long[arrayLength];
        for(int i=0;i<=arrayLength-1;i++) {
            sumArray[i]=readConsole.nextLong();
        }
        readConsole.close();
        System.out.println(addArrayNumbers(sumArray));
    }

    static long addArrayNumbers(long arraySum[]) {
        long sum =0;
        for(int i=0; i<=arraySum.length-1;i++) {
            sum+=arraySum[i];
        }
        return sum;
    }
}
