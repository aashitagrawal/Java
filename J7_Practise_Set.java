package com.company;

import java.util.Scanner;

public class J7_Practise_Set {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        //Q1
        int a,b,c;
        System.out.println("Enter 3 numbers ");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        System.out.println("Sum is " + (a+b+c));

        //Q2
        System.out.println("\n\nEnter marks of three subjects ");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        System.out.println("Your GPA is " + ((a+b+c)/30));

        //Q3
        String name;
        System.out.println("\n\nEnter your name ");
        name = s2.nextLine();
        System.out.println("\n\nHello! "+name+", Have a nice day.");

        //Q4
        System.out.println("\n\nEnter kms ");
        a = s.nextInt();
        System.out.println(a+"kms = "+(a/1.609)+"miles");

        //Q5
        boolean truth;
        System.out.println("\n\nEnter a number to check if its integer of not ");
        truth = s.hasNextInt();
        System.out.println(truth);

        //the end

    }
}
