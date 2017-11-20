package com.Algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by MacUser on 21/11/17.
 */
public class StairCase {
    public static void main(String args[]) {
        Scanner readConsle = new Scanner(System.in);
        int size = readConsle.nextInt();

        for(int i=0;i<=size-1;i++) {
            for(int j=size-1;j>=0;j--){
                if(j<=i){
                    System.out.print("#");}
                else{
                    System.out.print(" "); }
            }
            System.out.println();
        }
    }
}
