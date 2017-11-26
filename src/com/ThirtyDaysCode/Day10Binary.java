package com.ThirtyDaysCode;

import java.util.*;

/**
 * Created by MacUser on 26/11/17.
 */
public class Day10Binary {

    public static void main(String args[]) {
        Scanner readConsole = new Scanner(System.in);
        int binaryNumber = readConsole.nextInt();
        readConsole.close();

        String convertedBinaryNumber = Integer.toBinaryString(binaryNumber);
        int concecitiveOnes =0 ;
        String strSplit[] = convertedBinaryNumber.split("0");

        for(int i=0;i<strSplit.length;i++) {
            if(concecitiveOnes<(strSplit[i]).length())
                concecitiveOnes = (strSplit[i]).length();
        }

        System.out.println(concecitiveOnes);
    }
}
