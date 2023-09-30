package com.company;
import java.util.Scanner;

public class P7_Kaprekar_Number {

    public static int checkKap(int checkNum)
    {
        int square = checkNum*checkNum;
        int noOfDigits = howManyDigits(square);
        int [] squaredNumberDigits = new int[noOfDigits];
        int rem,count=0,temp=square;
        for (int i=1; i<=noOfDigits; i++) //getting squaredNumbers' digits in a array
        {
            rem = temp%10;
            squaredNumberDigits[count]=rem; count++;
            temp = temp/10;
        }
        int sum1=0,sum2=0,check=0;
        for (int i=0; i<=(noOfDigits/2)-1; i++)
        {
            for(int k=0; k<=i; k++)
            {
                sum1 += squaredNumberDigits[k];
            }

            for(int j=i+1; j<=(noOfDigits-1); j++)
            {
                sum2 += squaredNumberDigits[j];
            }
            if (checkNum==(sum1+sum2))
            {
                check =1;
                break;
            }

        }
        return check;
    }

    public static int howManyDigits(int squaredNumber)
    {
        int count=0;
        while (squaredNumber>0)
        {
            squaredNumber = squaredNumber/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("If square of a number splits into two parts, which adds upto original number, is called a Kaprekar Number \n"+"How many Kaprekar Number you want to print");
        Scanner s1 = new Scanner(System.in);
        int num = s1.nextInt();
        int count=0, i=4,check;
        while (true)
        {
            if(count==num)
            {
                break;
            }
            check = checkKap(i);
            if(check==1)
            {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }

    }

}
