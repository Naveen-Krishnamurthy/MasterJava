package com.Algorithms.Warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by MacUser on 22/11/17.
 */
public class BirthdayCandles {

    public static void main(String args[]) {
        Scanner readConsole = new Scanner(System.in);
        int numberOfCandles = readConsole.nextInt();
        int candleHeight[] = new int[numberOfCandles];
        int maximumHeightCount=0, maxHeight=0;
        for(int i=0;i<=numberOfCandles-1;i++) {
            candleHeight[i] = readConsole.nextInt();
        }
        readConsole.close();

        List<Integer> candleArrayList = new ArrayList<Integer>();
        for(int dummyCandle : candleHeight) {
            candleArrayList.add(dummyCandle);
        }

        maxHeight=Collections.max(candleArrayList);
        for(int dummyCandle : candleArrayList) {
            if(dummyCandle==maxHeight)
                maximumHeightCount++;
        }

        System.out.println(maximumHeightCount);






    }
}
