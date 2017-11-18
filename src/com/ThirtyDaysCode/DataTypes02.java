package com.ThirtyDaysCode;

import java.util.Scanner;

/**
 * Created by MacUser on 17/11/17.
 */
public class DataTypes02 {
    public static void main(String args[]) {
        Scanner readConsole = new Scanner(System.in);
        int i = 20;
        double d = 17.0;
        String s = "HackerTest ";
        i+=readConsole.nextInt();
        d+=readConsole.nextDouble();
        s+=readConsole.next();
        s+=readConsole.nextLine();
        readConsole.close();

        System.out.println(i);
        System.out.println(d);
        System.out.println(s);
    }
}