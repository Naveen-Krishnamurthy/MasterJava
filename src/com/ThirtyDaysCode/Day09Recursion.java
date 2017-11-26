package com.ThirtyDaysCode;

import java.util.Scanner;

/**
 * Created by MacUser on 26/11/17.
 */
public class Day09Recursion {

    //Factorial
    static int Factorial(int n) {
        if(n<=1)
            return 1;
        else
            return n * Factorial(n-1);
    }


    //Main method
    public static void main(String args[]) {
        Scanner readConsole = new Scanner(System.in);
        int factNumb = readConsole.nextInt();
        readConsole.close();
        System.out.println(Factorial(factNumb));
    }
}
