package com.company;
import java.util.Scanner;
public class P6_Triangle {
    static void space(int s)
    {
        for(int i=1; i<=s; i++)
        {
            System.out.print(" ");
        }
    }
    static int totalNumReq(int n)
    {
        int sum=0;
        for(int i=1; i<=n; i++)
        {
            sum+=n;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter base length of triangle");
        Scanner s1 = new Scanner(System.in);
        int baseLength = s1.nextInt();
        int totalNum = totalNumReq(baseLength);

        int [] number = new int[1000];
        int count =0;

        for(int i=1; i<= ((totalNum/9)+1); i++) //putting 1to9 numbers in array
        {
            for (int j=1; j<=9; j++)
            {
                if(i==((totalNum/9)+1))
                {
                    if(j==((totalNum%9)+1)) {break;}
                    number[count]=j;
                    count++;
                }
                if(i!=((totalNum/9)+1))
                {
                    number[count]=j;
                    count++;
                }
            }
        }

        count=0;
        for(int i=1; i<=baseLength; i++) //printing triangle
        {
            int spaces = baseLength-i;
            space(spaces);
            for (int j=1; j<=i; j++)
            {
                System.out.print(number[count] + " ");
                count++;
            }
            System.out.println();
        }

        //Showing the length
        int position = (2*baseLength-3)/2;
        System.out.print("|");
        for(int i=1; i<=2*baseLength-3; i++)
        {
            if(i!=position)
            {
                System.out.print("-");
            }
            else {
                System.out.print(baseLength);
            }
        }
        System.out.println("|");

    }
}
