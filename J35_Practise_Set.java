package com.company;
import java.util.Scanner;

public class J35_Practise_Set {

    static void mulTable(int num) //que1
    {
        for (int i = 1; i <= 10; i++) {
            System.out.print(num + "*" + i + "=" + (num * i) + "\t");
        }
    }

    static void pattern(int num) //que 2
    {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    int sumOfNatNum(int num) //que 3
    {
        if (num == 1) {
            return 1;
        }

        return num + sumOfNatNum(num - 1);
    }

    static void pattern2(int num) //que 4
    {
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    static int fib(int num) //que 5
    {
        if (num == 1) {
            return 0;
        } else if (num == 2) {
            return 1;
        } else {
            return ((fib(num - 2)) + (fib(num - 1)));
        }
    }

    static int average(int... setOfNumbers) //que6
    {
        int sum = 0;
        for (int ele : setOfNumbers) {
            sum += ele;
        }
        return sum / setOfNumbers.length;
    }

    static void pattern2_rec(int num) //que 7
    {
        if (num > 0) {
            pattern2_rec(num - 1);
            for (int i = 1; i <= num; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern1_rec(int num)
    {
        if(num>0)
        {
            for (int i = 1; i <=num; i++) {
                System.out.print("* ");
            }
            System.out.println();
            pattern1_rec(num-1);
        }
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        int num;

        //Que 1
//        System.out.println("Enter number");
//        num=s1.nextInt();
//        mulTable(num);
//        System.out.println();
//
//
//        //Que 2
//        System.out.println("Enter a number to print the pattern");
//        num= s1.nextInt();
//        pattern(num);
//        System.out.println();
//
//
//        //Que 3
//        J35_Practise_Set noStatic = new J35_Practise_Set();
//        System.out.println("Sum of 'N' natural numbers");
//        num= s1.nextInt();
//        System.out.println(noStatic.sumOfNatNum(num));
//        System.out.println();
//
//
//        //Que 4
//        System.out.println("Enter a number to print the pattern");
//        num= s1.nextInt();
//        pattern2(num);
//        System.out.println();


//        Que 5
        System.out.println("nᵗʰ term of Fibonacci series ");
        num = s1.nextInt();
        System.out.println(fib(num));
        System.out.println();


        //Que 6
//        System.out.println("Average of these numbers are " + average(2,4,6,8,10,12));


        //Que 7
        System.out.println("Enter number of lines to print");
        num = s1.nextInt();
        pattern2_rec(num);
        System.out.println();


        //Que 8
        System.out.println("Enter number of lines to print");
        num= s1.nextInt();
        pattern1_rec(num);
        System.out.println();

        //Que 10
        int sum=0;
        System.out.println("Sum of N Natural Numbers");
        num = s1.nextInt();
        for(int i=1; i<=num; i++)
        {
            sum += i;
        }
        System.out.println(sum);
        System.out.println();
    }
}
