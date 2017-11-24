package com.ThirtyDaysCode;

import java.util.Scanner;

/**
 * Created by MacUser on 22/11/17.
 */
public class Day06LetsReview {

    public static void main(String args[]) {
        Scanner readConsole = new Scanner(System.in);
        int numberOfTestCase = readConsole.nextInt();
        readConsole.nextLine();
        String reviewArray[]= new String[numberOfTestCase];
        for(int i=0;i<=numberOfTestCase-1;i++) {
            reviewArray[i]= readConsole.nextLine();
        }
        readConsole.close();

        char readStringChar[];
        String oddCharacters="", evenCharacters="";

        for(int i=0;i<=reviewArray.length-1;i++) {
            readStringChar=reviewArray[i].toCharArray();
            for(int j=0;j<=readStringChar.length-1;j++) {
                if(j%2==0){
                    evenCharacters+=readStringChar[j];
                }
                else {
                    oddCharacters+=readStringChar[j];
                }
            }
            System.out.println(evenCharacters+"  "+oddCharacters);
            evenCharacters="";oddCharacters="";
        }

    }
}
