package com.company;
import java.util.Scanner;

public class J19_Practise_Set {
    public static void main(String[] args) {
        //Que 1
        //Answer = Error will occur
        Scanner s1 = new Scanner(System.in);

        //Que 2
        int a,b,c;
        System.out.println("Enter marks of three subjects (out of 100)");
        a = s1.nextInt();
        b = s1.nextInt();
        c= s1.nextInt();
        int d = (a+b+c)/3;
        System.out.println("You got "+d+"%");
        if (a>=33 && b>=33 && c>=33 && d>=40)
        {
            System.out.println("You are passed :) ");
        }
        else
        {
            System.out.println("You failed, try next time :) ");
        }


        //Que 3
        System.out.println("\nEnter your salary (in lacs)");
        float e = s1.nextFloat();
        if(e>10)
        {
            float f = (float)((2.5*0.05)+(5*0.2)+((e-10)*0.3));

            System.out.println("You have to pay "+f+"lacs as your income tax");
        }
        else if(e<=10 && e>5)
        {
            float f = (float) ((2.5*0.05)+((e-5)*0.2));
            System.out.println("You have to pay "+f+"lacs as your income tax");
        }
        else if (e<=5 && e>2.5)
        {
            float f = (float)((e-2.5)*0.05);
            System.out.println("You have to pay "+f+"lacs as your income tax");
        }
        else
        {
            System.out.println("You don't have to pay income tax :) ");
        }

        //Que 4
        // what is this que


        //Que 5
        int year;
        System.out.println("Enter a year, to find if its leap year or not");
        year = s1.nextInt();
        if(year%4==0)
        {
            System.out.println("Its a leap year");
        }
        else
        {
            System.out.println("Its NOT a leap year");
        }

        //Que 6
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter your webiste name");
        String website = s2.next();
        if(website.endsWith(".com"))
        {
            System.out.println("This is a commerical website");
        }
        else if(website.endsWith(".org"))
        {
            System.out.println("This is a organisational website");
        }
        else if(website.endsWith(".in"))
        {
            System.out.println("This is a indian website");
        }

    }
}
