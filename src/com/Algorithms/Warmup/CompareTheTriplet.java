package com.Algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by MacUser on 17/11/17.
 */
public class CompareTheTriplet {

    static int[] solve(int a[],int b[]) {
        int aliceResult=0, bobResult=0;
        for(int i=0;i<=a.length-1;i++) {
            if (a[i] == b[i]) {
                aliceResult+=0 ;bobResult +=0;
            } else if (a[i] > b[i]) {
                aliceResult+=1 ;bobResult +=0;
            } else {
                aliceResult +=0 ;bobResult +=1; }
        }
        return new int[]{aliceResult,bobResult};
    }


    public static void main(String args[]) {
        Scanner readConsole = new Scanner(System.in);
        int alice[]=new int[3];
        int bob[]=new int[3];
        for(int i=0;i<=alice.length-1;i++) {
            alice[i]=readConsole.nextInt();
        }

        for(int i=0;i<=bob.length-1;i++) {
            bob[i]=readConsole.nextInt();
        }

        int result[]=solve(alice,bob);
        for(int i=0;i<result.length;i++) {
            System.out.print(result[i]+(i!=result.length-1 ? " ": ""));
        }
    }
}
