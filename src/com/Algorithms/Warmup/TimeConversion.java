package com.Algorithms.Warmup;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by MacUser on 22/11/17.
 */
public class TimeConversion {

    public static void main(String args[]) {
        Scanner readConsole = new Scanner(System.in);
        String timeAmPm = readConsole.next();
        convertTime(timeAmPm);
    }

    static void convertTime(String time) {
        DateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");
        DateFormat outPutFormat = new SimpleDateFormat("HH:mm:ss");
        Date date=null;
        try {
            date=inputFormat.parse(time);
            System.out.println(outPutFormat.format(date));
        } catch(Exception ie) {
            System.out.println("Exception caught "+ie.getMessage());
        }
    }
}
