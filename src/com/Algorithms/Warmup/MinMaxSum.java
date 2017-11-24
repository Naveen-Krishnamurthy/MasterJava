package com.Algorithms.Warmup;

import java.util.*;

/**
 * Created by MacUser on 21/11/17.
 */
public class MinMaxSum {

    public static void main(String args[]) {
        Scanner readConsole = new Scanner(System.in);
        int numbers[]=new int[5];
        long sumExcludesCurrentIndex[]=new long[5];
        long dummyValue=0;
        long minNumber=0, maxNumber=0;
        List<Long> arrayList= new ArrayList<Long>();
        for(int i=0;i<=numbers.length-1;i++) {
            numbers[i]=readConsole.nextInt();
        }
        readConsole.close();


        for(int i=0;i<=numbers.length-1;i++) {
            for(int j=numbers.length-1;j>=0;j--){
               if(i!=j)
                   dummyValue+=numbers[j];
            }
            sumExcludesCurrentIndex[i]=dummyValue;
            dummyValue=0;
        }


        for(long temp: sumExcludesCurrentIndex) {
            arrayList.add(temp);
        }

        minNumber = Collections.min(arrayList);
        maxNumber = Collections.max(arrayList);

        System.out.println(minNumber+" "+maxNumber);


    }
}
