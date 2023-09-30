package com.company;
import java.util.Scanner;

public class P2_Stars_Pattern {
    public static void main(String[] args) {
        System.out.println("Enter number of lines to print");
        Scanner s1 = new Scanner(System.in);
        int num= s1.nextInt();

        if(num%2!=0)
        {
            int lines = (num-1)/2;
            for(int i =1; i<=lines; i++) //upper triangle
            {
                for(int j=1; j<=i; j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }

            for(int i=1; i<=(lines+1); i++)
            {
                System.out.print("* ");
            }
            System.out.println();

            for(int i =lines; i>=1; i--) //lower triangle
            {
                for(int j=1; j<=i; j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        else
        {
            int lines = num/2;
            for(int i =1; i<=lines; i++) //upper triangle
            {
                for(int j=1; j<=i; j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }

            for(int i =lines; i>=1; i--) //lower triangle
            {
                for(int j=1; j<=i; j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }

    }
}
