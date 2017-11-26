package com.ThirtyDaysCode;

/**
 * Created by MacUser on 26/11/17.
 */
public class RecursionPractice {

    //Summation
    static int Summation(int n) {
        if(n<=0)
            return 0;
        else
            return n + Summation(n-1);
    }

    //Factorial
    static int Factorial(int n) {
        if(n<=1)
            return 1;
        else
            return n * Factorial(n-1);
    }

    //Exponential
    static int Exponential(int n, int p) {
        if(p <= 0)
            return 1;
        else
            return n * Exponential(n,p-1);
    }

    //nTimesK
    static int nTimesk(int n, int k) {
        System.out.println("n :"+n);
        if(n >1)
            return k + nTimesk(n-1,k);
        else
            return k;
    }

    public static void main(String args[]) {

        System.out.println(Summation(5));
        System.out.println(Factorial(5));
        System.out.println(Exponential(10,5));
        int result = nTimesk(4,4);
        System.out.println(result);
    }
}
