package com.ThirtyDaysCode;

import java.util.Scanner;

/**
 * Created by MacUser on 16/11/17.
 */
public class HackerTest01 {

    public static void main(String args[]) {
        Scanner readConsole= new Scanner(System.in);
        String inputString = readConsole.nextLine();
        readConsole.close();
        System.out.println("Hello, World.");
        System.out.println(inputString);
    }
}

