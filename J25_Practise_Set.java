package com.company;
import java.util.Scanner;

public class J25_Practise_Set {
    public static void main(String[] args) {
        //Que1
        for (int i =4; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        //Que 2
        Scanner s1 = new Scanner(System.in);
        System.out.println("Sum to first 'n' even numbers");
        int num = s1.nextInt();
        int sum=0;
        int i=1;
        while(i<=(2*num))
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
            i++;
        }
        System.out.println("\nSum to first "+num+" even numbers is = "+sum);
        System.out.println();


        //Que 3
        System.out.println("Multiplication Table");
        int mul = s1.nextInt();
        for(int k=1; k<=(mul*10); k++)
        {
            if(k%mul==0)
            {
                System.out.print(k + " ");
            }
        }
        System.out.println();


        //Que 4
        System.out.println("Multiplication Table in reverse order");
        mul = s1.nextInt();
        for(int k=(mul*10); k>=1; k--)
        {
            if(k%mul==0)
            {
                System.out.print(k + " ");
            }
        }
        System.out.println();


        //Que 5
        int fact=1;
        int number;
        System.out.println("Find Factorial of ");
        number = s1.nextInt();
        for (i=1; i<=number; i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
        System.out.println();


        //QUe 6
        i=1;
        fact=1;
        while(i<=number)
        {
            fact=fact*i;
            i++;
        }
        System.out.println(fact);
        System.out.println();


        //Que 7
        i=4;
        while(i>=1)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        System.out.println();


        //Que 9
        System.out.println("Sum of a Multiplication table");
        mul = s1.nextInt();
        sum=0;
        for(int k=1; k<=(mul*10); k++)
        {
            if(k%mul==0)
            {
                sum=sum+k;
            }
        }
        System.out.println("Sum is "+sum);
        System.out.println();


        //QUe 10
        System.out.println("Sum to first 'n' even numbers");
        num = s1.nextInt();
        sum=0;
        for (i=1; i<=(2*num); i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
        }
        System.out.println("\nSum to first "+num+" even numbers is = "+sum);
        System.out.println();


    }
}
