package com.ThirtyDaysCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by MacUser on 23/11/17.
 */
public class Day07Arrays {

    public static void main(String args[]) {
        Scanner readConsole = new Scanner(System.in);
        int arraySize=0;

        //Check the arraySize, it shouldn't exceed the 1>=arraySize<=10000
        while(arraySize<=0 || arraySize>1000) {
            arraySize = readConsole.nextInt();
        }

        int sampleIntArray[] = new int[arraySize];

        //Check if the index ranges between 1 & 100000
        for(int i=0;i<=arraySize-1;i++) {
            sampleIntArray[i]=0;
            while(sampleIntArray[i]<=0 || sampleIntArray[i]>100000){
                sampleIntArray[i]=readConsole.nextInt();
            }
        }
        readConsole.close();

        List<Integer> arrayList = new ArrayList<Integer>();
        for(int i : sampleIntArray)
            arrayList.add(i);

        //Reverse the order using collections class
        Collections.reverse(arrayList);
        for(int reverseIndex : arrayList) {
            System.out.print(reverseIndex+" ");
        }
        System.out.println();
    }

}
