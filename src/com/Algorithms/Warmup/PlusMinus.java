package com.Algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by MacUser on 21/11/17.
 */
public class PlusMinus {

    public static void main(String args[]) {
        Scanner readConsole = new Scanner(System.in);
        int size = readConsole.nextInt();
        int numbers[]=new int[size];
        for(int i=0;i<=numbers.length-1;i++) {
            numbers[i]=readConsole.nextInt();
        }
        readConsole.close();
        checkNumbersFraction(numbers);
    }

    static void checkNumbersFraction(int number[]) {
        int totalElement = number.length;
        float positiveNumber=0, negativeNumber=0, zeroNumber=0;
        for(int i=0;i<=number.length-1;i++) {
            if(number[i]<0)
                negativeNumber+=1;
            else if(number[i]==0)
                zeroNumber+=1;
            else
                positiveNumber+=1;
        }

        System.out.println(positiveNumber/totalElement);
        System.out.println(negativeNumber/totalElement);
        System.out.println(zeroNumber/totalElement);
    }
}

