package com.ThirtyDaysCode;

import java.util.Scanner;

/**
 * Created by MacUser on 18/11/17.
 */
public class OperatorsDay02 {

    static double calculatePercent(double amnt, int percentageRate) {
        return ((amnt*percentageRate)/100);
    }

    public static void main(String args[]) {
        Scanner readConsole = new Scanner(System.in);
        double mealMRP = readConsole.nextDouble();
        int tipRate = readConsole.nextInt();
        int taxRate = readConsole.nextInt();
        double totalMealRate = 0;

        totalMealRate=mealMRP+calculatePercent(mealMRP,tipRate)+calculatePercent(mealMRP,taxRate);
        System.out.println("The total meal cost is "+ Math.round(totalMealRate)+" dollars.");

    }
}
