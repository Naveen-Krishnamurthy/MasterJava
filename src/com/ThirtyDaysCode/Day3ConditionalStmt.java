package com.ThirtyDaysCode;

import java.util.Scanner;

/**
 * Created by MacUser on 20/11/17.
 */
public class Day3ConditionalStmt {

    public static void main(String args[]) {
        Scanner readConsole = new Scanner(System.in);
        int number = readConsole.nextInt();
        readConsole.close();
        System.out.println(checkNumber(number));

    }

    static String checkNumber(int num) {
        String result=null;
        if(num%2!=0)
            result = "Weird";
        else if(num%2==0 && num>=2 && num <=5)
            result = "Not Weird";
        else if(num%2==0 && num>=6 && num <=20)
            result = "Weird";
        else if(num>20)
            result = "Not Weird";

        return result;
    }
}
