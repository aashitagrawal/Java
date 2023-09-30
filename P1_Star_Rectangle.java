package com.company;
import java.util.Scanner;

public class P1_Star_Rectangle {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Make Rectangle with Stars");
        System.out.println("Enter length");
        int length = s1.nextInt();
        System.out.println("Enter breadth");
        int breadth = s1.nextInt();

        for(int i=1; i<=breadth; i++) //1st line
        {
            System.out.print("* ");
        }
        System.out.println();


        for(int i =1; i<=(length-2); i++)//Middle Lines
        {
            System.out.print("*");
            for(int j=1; j<=(((breadth-2)*2)+1); j++)
            {
                System.out.print(" ");
            }
            System.out.print("*\n");
        }

        for(int i=1; i<=breadth; i++) //Last Line
        {
            System.out.print("* ");
        }
    }
}
