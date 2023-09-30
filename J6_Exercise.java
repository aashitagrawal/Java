package com.company;

import java.util.Scanner;

public class J6_Exercise {
    public static void main(String[] args) {
        Scanner a1 =new Scanner(System.in);
        int v,w,x,y,z;
        System.out.println("Enter marks 1 ");
        v = a1.nextInt();
        System.out.println("Enter marks 2 ");
        w = a1.nextInt();
        System.out.println("Enter marks 3 ");
        x = a1.nextInt();
        System.out.println("Enter marks 4 ");
        y = a1.nextInt();
        System.out.println("Enter marks 5 ");
        z = a1.nextInt();

        System.out.println("\nPercentage = " + ((v+w+x+y+z)/5) + "%");

    }
}
