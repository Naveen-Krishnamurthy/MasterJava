package com.ThirtyDaysCode;


import java.util.Scanner;
/**
 * Created by MacUser on 20/11/17.
 */
public class Person {
    int age;

    Person(int initialAge) {
        if(initialAge>=0)
            age=initialAge;
        else {
            age=0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    void yearPasses() {
        age++;
    }

    void amIOld() {
        if(age<13)
            System.out.println("You are young.");
        else if(age>=13 && age<18)
            System.out.println("You are a teenager.");
        else
            System.out.println("You are old.");
    }

}

class Day04ClassInstance {

    public static void main(String args[]) {
        Scanner readConsle = new Scanner(System.in);
        int testCase = readConsle.nextInt();
        int ageArray[] = new int[testCase];
        Person person = null;

        for(int i=0;i<=testCase-1;i++) {
            ageArray[i]=readConsle.nextInt();
        }

        for(int i=0;i<=ageArray.length-1; i++) {
            person = new Person(ageArray[i]);
            person.amIOld();
            for(int j=0;j<=2;j++) {
                person.yearPasses();
            }
            person.amIOld();
            System.out.println();
        }



    }
}
