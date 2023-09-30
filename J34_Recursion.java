package com.company;
import java.util.Scanner;

public class J34_Recursion {

    static int fact(int a)
    {
        if(a==1 || a==0)
        {
            return 1;
        }
        else
        {
            return (a*fact(a-1));
        }
    }

    public static void main(String[] args) {
        int num;
        System.out.println("Factorial using Recursion");
        Scanner s1 = new Scanner(System.in);
        num = s1.nextInt();
        System.out.println(fact(num));


    }
}
