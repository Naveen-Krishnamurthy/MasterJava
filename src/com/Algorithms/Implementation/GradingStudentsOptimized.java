package com.Algorithms.Implementation;

import java.util.Scanner;

/**
 * Created by MacUser on 23/11/17.
 */
public class GradingStudentsOptimized {

    public static void main(String args[]) {
        Scanner readConsole = new Scanner(System.in);
        int numberOfStudents= readConsole.nextInt();
        for(int i=0;i<numberOfStudents;i++) {
            int grade=readConsole.nextInt();
            int mutiply = (grade+5) - (grade%5);
            if(grade>=38 && (grade-mutiply)<3) {
                grade=mutiply;
            }
            System.out.println(grade);
        }
    }

}
