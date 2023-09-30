package com.company;
import java.util.Scanner;

public class P4_Prime_Numbers_Rectangle {
    public static void main(String[] args) {
        int count = 0;
        int [] primeNumbers = new int[143];
        for(int i=100; i<=999; i++) //Getting all '3' digit prime no. in a array
        {
            for(int j=2; j<i; j++)
            {
                if(i%j==0)
                {
                    break;
                }
                else if (j==i-1)
                {
                    primeNumbers[count]=i;
                    count++;
                }
            }
        }

        //Printing The Rectangle
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter length");
        int length = s1.nextInt();
        System.out.println("Enter breadth");
        int breadth = s1.nextInt();

        int max = (((length-2)*2)+2*breadth);

        if(max<144) {
            count = 0;
            for (int i = 1; i <= breadth; i++) //1st line
            {
                System.out.print(primeNumbers[count] + " ");
                count++;
            }
            System.out.println();

            for (int i = 1; i <= length - 2; i++) //Middle Lines
            {
                System.out.print(primeNumbers[count]);
                count++;
                for (int j = 1; j <= ((breadth - 2) * 4) + 1; j++) {
                    System.out.print(" ");
                }
                System.out.println(primeNumbers[count]);
                count++;
            }

            for (int i = 1; i <= breadth; i++) //Last line
            {
                System.out.print(primeNumbers[count] + " ");
                count++;
            }
        }
        else
        {
            System.out.println("Sorry! Try entering lower values of length and breadth");
        }
    }
}
