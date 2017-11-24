package com.ThirtyDaysCode;

import java.util.Scanner;

/**
 * Created by MacUser on 21/11/17.
 */
public class Day05Loops {

    public static void main(String args[]) {
        Scanner readConsole = new Scanner(System.in);
        int number = readConsole.nextInt();

        for(int i=1;i<=10;i++) {
            System.out.println(number+" x "+i+" = "+(number*i));
        }

    }

}
