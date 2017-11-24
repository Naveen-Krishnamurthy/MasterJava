package com.Algorithms.Implementation;

import java.util.Scanner;

/**
 * Created by MacUser on 23/11/17.
 */
public class GradingStudents {

    static void roundUpGrade(int grade) {
        int mltplOfIndFive=1;
        if(grade>=38) {
            for(int index=1;index<=20;index++) {
                mltplOfIndFive=index*5;
                if(mltplOfIndFive-grade<3 && mltplOfIndFive-grade>=0) {
                    grade=mltplOfIndFive;
                    break; }
            }
        }

        System.out.println(grade);
    }


    public static void main(String args[]) {

        Scanner readConsle = new Scanner(System.in);
        int numberOfStudents= 0;
        while(numberOfStudents<=0 || numberOfStudents>60)
            numberOfStudents=readConsle.nextInt();

        int students[] = new int[numberOfStudents];
        readConsle.nextLine();
        for(int i=0;i<=numberOfStudents-1; i++) {
            students[i]=-1;
            while(students[i]<0 || students[i]>100)
                students[i]=readConsle.nextInt();
        }

        readConsle.close();

        for(int Indgrade : students)
            roundUpGrade(Indgrade);

    }
}
